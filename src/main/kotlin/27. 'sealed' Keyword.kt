// Only classes in the curly braces, or in this file can extend Response

sealed class Response {
    class Success(message: String) : Response()
}

class Failure(code: Int, message: String) : Response()
