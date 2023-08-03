val one = 1
val threeBillion = 3000000000
val oneLong = 1L
val oneByte: Byte = 1

fun main() {
    var pi = 3.14
    // val one: Double = 1 error
    val oneDouble = 1.0
    val e = 2.7182818284
    val eFloat = 2.7182818284f

    val i = 0
    val d = 1.0
    val f = 1.0f

    printDouble(d)
    // printDouble(i) error
    // printDouble(f) error

    val decimalNumber = 42
    val hexNumber = 0x1A
    val binaryNumber = 0b1010
    val longNumber = 1234567890L
    val pi2 = 3.14
    val smallPi = 3.14F
    val largeNumber = 1_000_000

    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)
    println(boxedB == anotherBoxedB)

    val b2: Byte = 1
    // val I: Int = b2 error
    val i1: Int = b2.toInt()

    val l = 1L + 3 // Long + Int => Long
    println(l)

    val b3: Byte = 1
    val i2: Int = b3.toInt()

    val l2 = 1L + 3

    val x = 5 / 2
    println(x == 2)

    val x2 = 5L / 2
    println(x2 == 2L)

    val x3 = 5 / 2.toDouble()
    println(x3 == 2.5)
}

fun printDouble(d: Double) { println(d) }