fun main(args: Array<String>) {
    functionWithParameterDefaultValues("<custom value 1 for a>")
    functionWithParameterDefaultValues(a = "<custom value 2 for a>", b = "<custom value 1 for b>")
}

fun functionWithParameterDefaultValues(a: String, b: String = "<default value for b>") {
    println("Printing params of \"functionWithParameterDefaultValues\": $a; $b")
}
