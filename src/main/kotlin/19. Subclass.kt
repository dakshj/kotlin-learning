fun main(args: Array<String>) {
    Animal().makeSound()
    Dog().makeSound()
}

open class Animal {

    open fun makeSound() {
        println("Making animal sounds")
    }
}

class Dog : Animal() {

    override fun makeSound() {
        println("Woofing")
    }
}
