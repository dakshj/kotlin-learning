fun main(args: Array<String>) {
    val a = "1"

    if (a == null) {
        println("a can never be null!")
    }

    val b: String? = null

    if (b == null) {
        println("b is now null!")
    }

    print("Converting a nullable b to int by using \"?\" = ")
    println(b?.toInt())

    print("Converting a nullable b to int by using \"!!\" to throw a NullPointerException if null = ")
    println(b!!.toInt())
}
