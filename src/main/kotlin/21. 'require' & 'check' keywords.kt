fun main(args: Array<String>) {
    Student("Daksh")
    Student("Daksh", 25)
}

private class Student(name: String) {

    init {
        // Throws java.lang.IllegalArgumentException
        require(name.startsWith("D"))

        // Custom error message
        require(name.length > 4) {"Name length should be more than four letters"}
    }

    constructor(name: String, age: Int) : this(name) {
        // Throws java.lang.IllegalStateException
        check(age > 20)
    }
}
