val str = "abcd 123"

fun main() {
    for (c in str) {
        println(c)
    }

    println(str.uppercase())
    println(str)

    val s = "Hello, world!\n"

    val text = """
        for (c in "foo")
            print(c)
    """.trimIndent()

    println(text)

    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """

    println(text2)
    println(text2.trimMargin())

    val i = 10
    println("i = $i")

    val s2 = "abc"
    println("$s.length is ${s.length}")
}