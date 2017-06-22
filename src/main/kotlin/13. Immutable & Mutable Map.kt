fun main(args: Array<String>) {
    val map = mapOf('A' to 'A'.toInt(),
            'B' to 'B'.toInt())
    // map['A'] = 'a'.toInt() // Will not compile since "map" is immutable

    val mutableMap = mutableMapOf('A' to 'A'.toInt(),
            'B' to 'B'.toInt())
    mutableMap['A'] = 'a'.toInt()
    println(mutableMap)

    for ((key, value) in mutableMap) {
        println("$key, $value")
    }

    mutableMap.forEach { key, value -> println("$key, $value") }
}
