fun main(args: Array<String>) {
    Animal().makeSound()
    Dog().makeSound()
}

private open class Animal {

    open fun makeSound() {
        println("Making animal sounds")
    }
}

private interface GoodBoy {
    fun isGoodBoy(): Boolean
}

private class Dog : Animal(), GoodBoy {

    override fun makeSound() {
        println("Woofing")
    }

    override fun isGoodBoy() = true
}
