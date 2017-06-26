// Kotlin's alternative of Java's static final fields

class ConstantClass {
    companion object {
        const val CONSTANT_FIELD = "This is a constant field!"
    }
}

fun main(args: Array<String>) {
    println("Value of constant field = \"${ConstantClass.CONSTANT_FIELD}\"")
}
