package com.rider.kotlin.fp.function

/** Curry **/

val <R> (() -> R).curry: () -> R
    get() = this

val <P1, R> ((P1) -> R).curry: (P1) -> R
    get() = this

val <P1, P2, R> ((P1, P2) -> R).curry: (P1) -> (P2) -> R
    get() = { p1 -> { p2 -> this(p1, p2) } }

val <P1, P2, P3, R> ((P1, P2, P3) -> R).curry: (P1) -> (P2) -> (P3) -> R
    get() = { p1 -> { p2 -> { p3 -> this(p1, p2, p3) } } }

val <P1, P2, P3, P4, R> ((P1, P2, P3, P4) -> R).curry: (P1) -> (P2) -> (P3) -> (P4) -> R
    get() = { p1 -> { p2 -> { p3 -> { p4 -> this(p1, p2, p3, p4) } } } }


fun <R> curry(f: () -> R): () -> R = f.curry

fun <P1, R> curry(f: (P1) -> R): (P1) -> R = f.curry

fun <P1, P2, R> curry(f: (P1, P2) -> R): (P1) -> (P2) -> R = f.curry

fun <P1, P2, P3, R> curry(f: (P1, P2, P3) -> R): (P1) -> (P2) -> (P3) -> R = f.curry

fun <P1, P2, P3, P4, R> curry(f: (P1, P2, P3, P4) -> R): (P1) -> (P2) -> (P3) -> (P4) -> R = f.curry


/** Uncurry */

val <R> (() -> R).uncurry: () -> R
    get() = this

val <P1, R> ((P1) -> R).uncurry: (P1) -> R
    get() = this

val <P1, P2, R> ((P1) -> (P2) -> R).uncurry: (P1, P2) -> R
    get() = { p1, p2 -> this(p1)(p2) }

val <P1, P2, P3, R> ((P1) -> (P2) -> (P3) -> R).uncurry: (P1, P2, P3) -> R
    get() = { p1, p2, p3 -> this(p1)(p2)(p3) }

val <P1, P2, P3, P4, R> ((P1) -> (P2) -> (P3) -> (P4) -> R).uncurry: (P1, P2, P3, P4) -> R
    get() = { p1, p2, p3, p4 -> this(p1)(p2)(p3)(p4) }