fun main() {
    val obj = "s"
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) {
        println("Not a String")
    } else {
        println(obj.length)
    }

    when (val x: Any = 2) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum())
    }

    //val x: String = y as String
    //val x: String? = y as String?
    //val x: String? = y as? String
}

fun demo(x: Any) {
    if (x is String) {
        println(x.length)
    }
}

fun demo2(x: Any) {
    if (x !is String) return

    println(x.length)
}

fun demo3(x: Any) {
    if (x !is String || x.length == 0) return

    if (x is String && x.length > 0) {
        println(x.length)
    }
}