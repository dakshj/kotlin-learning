fun main(args: Array<String>) {
    println("a" equalsTo "a")
}

private infix fun String.equalsTo(s: String) = this == s
