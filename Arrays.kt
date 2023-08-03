val asc = Array(5) { i -> (i*i).toString() }

fun main() {
    asc.forEach { println(it) }

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x)

    val arr = IntArray(5)
    println(arr.toString())
    val arr2 = IntArray(5) { 42 }
    println(arr2.toString())
    val arr3 = IntArray(5) { it * 1 }
    println(arr3.toString())
}