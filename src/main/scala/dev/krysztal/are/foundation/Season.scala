package dev.krysztal.are.foundation

enum Season extends Enum[Season] {
    case Spring, Summer, Autumn, Winter

    def <->(target: Season) = (this.ordinal - target.ordinal).abs
}
