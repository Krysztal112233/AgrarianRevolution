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

package dev.krysztal.are.common

import com.mojang.serialization.Codec
import dev.krysztal.are.AgrarianRevolution.identifier
import dev.krysztal.are.common.data.CaffeineComponent
import dev.krysztal.are.common.data.SugarComponent
import net.minecraft.component.ComponentType
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry

object DataComponentTypes {

    val CAFFEINE: ComponentType[CaffeineComponent] =
        register("caffeine", CaffeineComponent.CODEC)
    val SUGAR: ComponentType[SugarComponent] =
        register("sugar", SugarComponent.CODEC)

    private inline def register[T](
        id: String,
        codec: Codec[T]
    ): ComponentType[T] = {
        Registry.register(
          Registries.DATA_COMPONENT_TYPE,
          identifier(id),
          ComponentType
              .builder()
              .codec(codec)
              .build()
        )
    }

    def initialize() = {}
}
