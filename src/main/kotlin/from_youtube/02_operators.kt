package from_youtube

fun main() {
    var x = 5
    var y = 3.0

    var result = x + y
    println(result)
    println("X + Y= ${x + y}")
    println("X - Y= ${x - y}")
    println("X * Y= ${x * y}")
    println("X / Y= ${x / y}")
    println("X % Y= ${x % y}")

    result = x + y
    println("Result - $result")
    result += 2
    result -= 2
    result *= 2
    result /= 2
    result %= 2


    // operator Precedence (), *, /, +, -.
    println("3 + 3 * 4 = ${3 + 3 * 4}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    // Comments
    // Single line comment
    /*
    Multi
    Line
    Comment
     */


}