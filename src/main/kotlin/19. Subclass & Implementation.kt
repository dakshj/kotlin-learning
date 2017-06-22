fun main(args: Array<String>) {
    Animal().makeSound()
    Dog().makeSound()
}

open class Animal {

    open fun makeSound() {
        println("Making animal sounds")
    }
}

interface GoodBoy {
    fun isGoodBoy(): Boolean
}

class Dog : Animal(), GoodBoy {

    override fun makeSound() {
        println("Woofing")
    }

    override fun isGoodBoy() = true
}
