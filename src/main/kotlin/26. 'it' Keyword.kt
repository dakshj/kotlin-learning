fun main(args: Array<String>) {
    // "it" is used when there is a single parameter in a lambda
    println("Printing even numbers from 1 to 20...")
    (1..20).filter { it % 2 == 0 }
            .forEach { println(it) }
}
