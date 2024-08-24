package dev.krysztal.are.common.component

import dev.krysztal.are.common.WorldComponents.SEASON_COMPONENT
import dev.krysztal.are.common.component.SeasonComponentImpl.log
import dev.krysztal.are.foundation.Season
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.world.World
import org.ladysnake.cca.api.v3.component.ComponentV3
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent
import org.ladysnake.cca.api.v3.component.tick.ServerTickingComponent
import org.slf4j.LoggerFactory

trait SeasonComponent extends ComponentV3 {
    var season: Season = Season.Spring
    private[component] var shouldChangeSeason: Boolean = false
}

class SeasonComponentImpl(val world: World)
    extends SeasonComponent,
      AutoSyncedComponent,
      ServerTickingComponent {

    override def serverTick(): Unit = {
        tickSeason()
    }

    override def writeToNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        tag.putString("season", season.toString)
        tag.putBoolean("shouldChangeSeason", shouldChangeSeason)
    }

    override def readFromNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        season = Season.valueOf(tag.getString("season"))
        shouldChangeSeason = tag.getBoolean("shouldChangeSeason")
    }

    def tickSeason(): Unit = {
        val moonPhase = this.world.getMoonPhase()

        if (moonPhase != 0 || moonPhase != 7) {
            return;
        }

        if (moonPhase == 7 && this.shouldChangeSeason == false) {
            shouldChangeSeason = true
            return
        }

        if (moonPhase == 0 && this.shouldChangeSeason) {
            val toSeason = Season.fromOrdinal((this.season.ordinal + 1) % 4)
            log.debug(
              s"The season of world $world have been changed from $season to $toSeason"
            )
            this.season = toSeason
            this.shouldChangeSeason = false
            SEASON_COMPONENT.sync(this.world)
        }

    }
}

object SeasonComponentImpl {
    private lazy val log = LoggerFactory.getLogger("SeasonComponent")

    def apply(world: World) = new SeasonComponentImpl(world)
}
