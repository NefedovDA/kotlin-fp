package com.rider.kotlin.fp.function

class FpFunction0<out R>(
    private val f: () -> R
) : Function<R> {
    operator fun invoke(): R =
        f()
}

class FpFunction1<in P1, out R>(
    private val f: (P1) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction0<R> =
        FpFunction0 {
            f(p1)
        }
}

class FpFunction2<in P1, in P2, out R>(
    private val f: (P1, P2) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction1<P2, R> =
        FpFunction1 { p2 ->
            f(p1, p2)
        }
}

class FpFunction3<in P1, in P2, in P3, out R>(
    private val f: (P1, P2, P3) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction2<P2, P3, R> =
        FpFunction2 { p2, p3 ->
            f(p1, p2, p3)
        }
}

class FpFunction4<in P1, in P2, in P3, in P4, out R>(
    private val f: (P1, P2, P3, P4) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction3<P2, P3, P4, R> =
        FpFunction3 { p2, p3, p4 ->
            f(p1, p2, p3, p4)
        }
}

class FpFunction5<in P1, in P2, in P3, in P4, in P5, out R>(
    private val f: (P1, P2, P3, P4, P5) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction4<P2, P3, P4, P5, R> =
        FpFunction4 { p2, p3, p4, p5 ->
            f(p1, p2, p3, p4, p5)
        }
}

class FpFunction6<in P1, in P2, in P3, in P4, in P5, in P6, out R>(
    private val f: (P1, P2, P3, P4, P5, P6) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction5<P2, P3, P4, P5, P6, R> =
        FpFunction5 { p2, p3, p4, p5, p6 ->
            f(p1, p2, p3, p4, p5, p6)
        }
}

class FpFunction7<in P1, in P2, in P3, in P4, in P5, in P6, in P7, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction6<P2, P3, P4, P5, P6, P7, R> =
        FpFunction6 { p2, p3, p4, p5, p6, p7 ->
            f(p1, p2, p3, p4, p5, p6, p7)
        }
}

class FpFunction8<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction7<P2, P3, P4, P5, P6, P7, P8, R> =
        FpFunction7 { p2, p3, p4, p5, p6, p7, p8 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8)
        }
}

class FpFunction9<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction8<P2, P3, P4, P5, P6, P7, P8, P9, R> =
        FpFunction8 { p2, p3, p4, p5, p6, p7, p8, p9 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9)
        }
}

class FpFunction10<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction9<P2, P3, P4, P5, P6, P7, P8, P9, P10, R> =
        FpFunction9 { p2, p3, p4, p5, p6, p7, p8, p9, p10 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
        }
}

class FpFunction11<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction10<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> =
        FpFunction10 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
        }
}

class FpFunction12<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction11<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> =
        FpFunction11 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
        }
}

class FpFunction13<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction12<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> =
        FpFunction12 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
        }
}

class FpFunction14<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction13<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> =
        FpFunction13 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
        }
}

class FpFunction15<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, in P15, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction14<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> =
        FpFunction14 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
        }
}

class FpFunction16<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, in P15, in P16, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction15<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> =
        FpFunction15 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)
        }
}

class FpFunction17<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, in P15, in P16, in P17, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction16<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> =
        FpFunction16 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)
        }
}

class FpFunction18<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, in P15, in P16, in P17, in P18, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction17<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> =
        FpFunction17 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18)
        }
}

class FpFunction19<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, in P15, in P16, in P17, in P18, in P19, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction18<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> =
        FpFunction18 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19)
        }
}

class FpFunction20<in P1, in P2, in P3, in P4, in P5, in P6, in P7, in P8, in P9, in P10, in P11, in P12, in P13, in P14, in P15, in P16, in P17, in P18, in P19, in P20, out R>(
    private val f: (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
) : Function<R> {
    operator fun invoke(p1: P1): FpFunction19<P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> =
        FpFunction19 { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 ->
            f(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20)
        }
}
