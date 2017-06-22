fun main(args: Array<String>) {
    println("Sum of 1 to 20 = ${(1..20).reduce { x, y -> x + y }}")
}
