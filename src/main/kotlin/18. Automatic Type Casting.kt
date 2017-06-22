fun main(args: Array<String>) {
    val a: Any = "This is a String"

    // Calling a.length will not work here since it is an Any
    // println("Length of a = ${a.length}")

    if (a is String) {
        // a is automatically cast to String here
        println("Length of a = ${a.length}")
    }
}
