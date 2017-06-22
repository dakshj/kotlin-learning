fun getSquareAndCubeOfNumber(n: Int) =
        Math.pow(n.toDouble(), 2.toDouble()) to Math.pow(n.toDouble(), 3.toDouble())

fun main(args: Array<String>) {
    println(getSquareAndCubeOfNumber(2))
    val (square, cube) = getSquareAndCubeOfNumber(2)
    println("Square = $square, Cube = $cube")
}
