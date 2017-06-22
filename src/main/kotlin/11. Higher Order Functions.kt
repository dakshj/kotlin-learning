val add = { a: Double, b: Double -> a + b }
val subtract = { a: Double, b: Double -> a - b }
val multiply = { a: Double, b: Double -> a * b }
val divide = { a: Double, b: Double -> a / b }

fun calculate(a: Double, b: Double, calculation: (Double, Double) -> Double): Double {
    return calculation(a, b)
}

fun main(args: Array<String>) {
    println(calculate(10.0, 2.0, add))
    println(calculate(10.0, 2.0, subtract))
    println(calculate(10.0, 2.0, multiply))
    println(calculate(10.0, 2.0, divide))
}
