package dev.krysztal.are

import dev.krysztal.are.AgrarianRevolution.modID
import dev.krysztal.are.provider.ConventionalTagProvider
import dev.krysztal.are.provider.ModelProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class AgrarianRevolutionDataGenerator extends DataGeneratorEntrypoint {

    override def onInitializeDataGenerator(gen: FabricDataGenerator): Unit = {
        val pack = gen.createPack()

        pack.addProvider(ModelProvider(_))
        pack.addProvider(ConventionalTagProvider(_, _))
    }

    override def getEffectiveModId: String = modID
}
