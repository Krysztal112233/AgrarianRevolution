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

package dev.krysztal.are.provider.model

import dev.krysztal.are.common.Blocks.*
import dev.krysztal.are.common.Items.*
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models

import scala.compiletime.uninitialized

class BaseItemProvider {
    private var itemModelGenerator: ItemModelGenerator = uninitialized

    def this(itemModelGenerator: ItemModelGenerator) = {
        this()
        this.itemModelGenerator = itemModelGenerator

        registerItemGenerated()
    }

    private def registerItemGenerated() = {

        Array(
          ASHES,
          SULFUR,
          PHOSPHORCOAL,
          PHOSPHORUS,
          RAW_VERMICULITE,
          VERMICULITE
        ).foreach(itemModelGenerator.register(_, Models.GENERATED))

        Array(
          GINKGO_NUT,
          CORN,
          GRAPE,
          STRAWBERRY,
          WATER_CHESTNUT,
          SWEET_POTATO,
          GARLIC,
          LETTUCE,
          JICAMA,
          BAMBOO_LEAVES
        ).foreach(itemModelGenerator.register(_, Models.GENERATED))

        Array(HYBRID_NOTE, TRAIT_LENS).foreach(
          itemModelGenerator.register(_, Models.GENERATED)
        )
    }

    private def registerBlockGenerated() = {
        Array(ACIDIFIED_DIRT, ALKALIZED_DIRT, HARDENED_DIRT, APATITE_ORE)
            .foreach(block =>
                itemModelGenerator.register(block.asItem(), Models.CUBE)
            )
    }
}
