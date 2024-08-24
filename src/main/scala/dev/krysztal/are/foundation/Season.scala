package dev.krysztal.are.foundation

import dev.krysztal.are.common.WorldComponents
import dev.krysztal.are.foundation.as.AsWorld

enum Season {
    case Spring, Summer, Autumn, Winter;

    def between(target: Season) = (this.ordinal - target.ordinal).abs
}

object Season {
    def apply(asWorld: AsWorld): Season = {
        WorldComponents.SEASON_COMPONENT.get(asWorld.as()).season
    }
}
