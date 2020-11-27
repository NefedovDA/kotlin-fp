package com.rider.kotlin.fp.function


val foo = FpFunction2 { a: Int, b: Int -> a + b }

val bar: FpFunction1<Int, Int> = foo(1)

val undefined: Nothing
    get() = throw NotImplementedError("Undefined")

sealed class List<T> {
    class Nil<T> : List<T>()

    data class Concat<T>(val head: T, val tail: List<T>) : List<T>()
}

sealed class NonEmpty<T> {
    data class Concat<T>(val head: T, val tail: List<T>) : NonEmpty<T>()
}

interface Semigroup<T> {
    val operation: (T) -> (T) -> T

    val sconcat: (NonEmpty<T>) -> T
        get() = { a ->
            fun go(b: T, tail: List<T>): T =
                when (tail) {
                    is List.Nil -> b
                    is List.Concat -> operation(b)(go(tail.head, tail.tail))
                }

            when (a) {
                is NonEmpty.Concat -> undefined
            }
        }
}


interface Monoid<T> {
    fun empty(): T

    fun append(a1: T, a2: T): T
}

object SMonoid : Monoid<String> {
    override fun empty(): String = ""

    override fun append(a1: String, a2: String): String = a1 + a2
}

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C = { x -> f(g(x)) }

val sum: (Int) -> (Int) -> Int = curry(Int::plus)

val mult: (Int) -> (Int) -> Int = curry(Int::times)

val add3: (Int) -> Int = sum(3)

val mult2: (Int) -> Int = mult(3)

val add3mult2: (Int) -> Int = compose(add3, mult2)

val f: (Int) -> (Int) -> Int = compose(sum, mult2)