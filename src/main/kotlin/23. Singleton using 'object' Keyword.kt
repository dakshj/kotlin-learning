fun main(args: Array<String>) {
    Logger.log("Singleton")
}

private object Logger {
    fun log(message: String) = println(message)

}
