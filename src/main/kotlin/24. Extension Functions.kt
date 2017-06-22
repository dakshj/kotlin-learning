fun main(args: Array<String>) {
    "a".woof()
    3.woof()
}

private fun String.woof() {
    println("Woofing \"$this\"")
}

private fun Int.woof() {
    for (i in 1..this) {
        println("Woofing $i")
    }
}
