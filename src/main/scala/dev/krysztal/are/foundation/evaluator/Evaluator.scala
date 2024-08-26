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

package dev.krysztal.are.foundation.evaluator

import dev.krysztal.are.foundation.as.AsNbtCompound

trait Evaluator[T] {
    def eval(ctx: T): Class[? <: AsNbtCompound];
}

object Evaluator {

    case class EvaluatorChain[T](
        private val ctx: T,
        private val fList: List[(T) => Class[? <: AsNbtCompound]]
    ) {
        def chain(eval: Evaluator[T]): EvaluatorChain[T] = {
            EvaluatorChain(ctx, fList.appended(eval.eval))
        }

        def chain(eval: (T) => Class[? <: AsNbtCompound]): EvaluatorChain[T] = {
            EvaluatorChain(ctx, fList.appended(eval))
        }

        def evaluate() = {
            fList.map(_(ctx))
        }
    }

    def create[T](ctx: T): EvaluatorChain[T] = EvaluatorChain(ctx, List())
}
