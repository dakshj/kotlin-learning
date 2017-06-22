private fun sum(vararg nums: Int) = nums.sum()

fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum(1, 2, 3, 4))
    println(sum(1, 2, 3, 4, 5, 6))
}
