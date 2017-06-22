fun main(args: Array<String>) {
    Person("Daksh")
    Person("Daksh", 25)
}

private class Person(name: String) {

    init {
        // Primary constructor code
    }

    constructor(name: String, age: Int) : this(name) {
        // Secondary constructor code
    }
}
