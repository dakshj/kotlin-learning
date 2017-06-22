fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
    }

    val list = 1.to(10).toList()
    for (i in list.indices) {
        println(list[i])
    }

    (1..10).forEach { println(it) }
}
