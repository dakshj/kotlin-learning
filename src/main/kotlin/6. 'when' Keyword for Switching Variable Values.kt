fun main(args: Array<String>) {
    println(when (14) {
        in 1..2 -> "Toddler"
        in 3.rangeTo(5) -> "Baby"
        in 6..12 -> "Kid"
        in 13..19 -> "Teen"
        else -> "What?"
    })
}
