fun main(args: Array<String>) {
    Logger.log("Singleton")
}

object Logger {
    fun log(message: String) = println(message)

}
