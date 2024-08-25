/*
 * MIT License
 *
 * Copyright (c) 2024 KrysztalHuang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.krysztal.are.common.component

import dev.krysztal.are.common.component.TraitsMapComponent.log
import dev.krysztal.are.common.component.TraitsMapComponent.toKey
import dev.krysztal.are.common.gene.GeneticSequence
import net.minecraft.nbt.NbtCompound
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.util.math.BlockPos
import net.minecraft.world.chunk.Chunk
import org.ladysnake.cca.api.v3.component.ComponentV3
import org.slf4j.LoggerFactory

import scala.collection.immutable.HashMap

trait TraitsMapComponent extends ComponentV3 {
    val positionMap: HashMap[BlockPos, GeneticSequence] = HashMap()
}

class TraitsMapComponentImpl(val chunk: Chunk) extends TraitsMapComponent {

    override def readFromNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {
        this.positionMap.foreach((p, g) => {
            log.debug(s"Storage traits: $p -> $g")
            tag.put(toKey(p), g.as())
        })
    }

    override def writeToNbt(
        tag: NbtCompound,
        registryLookup: WrapperLookup
    ): Unit = {}
}

object TraitsMapComponent {
    lazy val log = LoggerFactory.getLogger("TraitsMap")

    def toKey(pos: BlockPos) = s"${pos.getX()};${pos.getY()};${pos.getZ()}"

    def fromKey(str: String) = {
        var pos = str.split(";")
        BlockPos(pos(0).toInt, pos(1).toInt, pos(2).toInt)
    }
}
