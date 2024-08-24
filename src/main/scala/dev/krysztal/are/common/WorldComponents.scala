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

import dev.krysztal.are.AgrarianRevolution.modID
import dev.krysztal.are.common.WorldComponents.SEASON_COMPONENT
import dev.krysztal.are.common.component.SeasonComponent
import dev.krysztal.are.common.component.SeasonComponentImpl
import net.minecraft.util.Identifier
import net.minecraft.world.World
import org.ladysnake.cca.api.v3.component.ComponentKey
import org.ladysnake.cca.api.v3.component.ComponentRegistryV3
import org.ladysnake.cca.api.v3.world.WorldComponentFactoryRegistry
import org.ladysnake.cca.api.v3.world.WorldComponentInitializer

class WorldComponents extends WorldComponentInitializer {
    override def registerWorldComponentFactories(
        registry: WorldComponentFactoryRegistry
    ): Unit = {
        registry.register(
          SEASON_COMPONENT,
          classOf[SeasonComponentImpl],
          SeasonComponentImpl(_)
        );
    }
}

object WorldComponents {
    val SEASON_COMPONENT: ComponentKey[SeasonComponent] =
        ComponentRegistryV3.INSTANCE.getOrCreate(
          Identifier.of(modID, "season"),
          classOf[SeasonComponent]
        )

    def initialize(): Unit = {}
}
