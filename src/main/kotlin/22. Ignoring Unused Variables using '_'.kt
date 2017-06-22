fun main(args: Array<String>) {
    val pairs = listOf("a" to 1, "b" to 2, "c" to 3)

    // Used vals
    for ((alpha, num) in pairs) {
        println("$alpha $num")
    }

    // Unused vals
    for ((_, _) in pairs) {
    }
}
