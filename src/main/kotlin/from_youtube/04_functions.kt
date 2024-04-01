package from_youtube

//fun main() {
//    println("|-----Functions-----|")
//    sayHello("Harish", 26)
//
//    val hasInternetConnection = true
//    if (hasInternetConnection) {
//        getData("{data: this is data}")
//    } else {
//        showMessage()
//    }
//
//    println("|-----Functions END-----|")
//}

fun sayHello(name: String, age: Int) {
    // function parameter are val by def, so they cannot be changed
    var age1 = age
    println(age1.equals(age))
    println("Hello, $name, your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no internet connection")
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMax1(a: Int, b: Int): Int = if (a > b) a else b
fun getMax1(a: Double, b: Double): Double = if (a > b) a else b

fun getMax(a: Double, b: Double, c: Double): Double {
    if (a >= b && a >= c) {
        return a
    } else if (b >= a && b >= c) {
        return b
    } else {
        return c
    }
}


//fun <T> singleExpressionFun(a: T, b: T): T = if (a > b) a else b


//default parameters
fun sendMessage(name: String = "no user", message: String = "no message") {
    println("Name: $name, message: $message")
}

fun sendText(): String {
    return "Some Text"
}

fun main() {
    println("|-----Functions-----|")
//    sendMessage(message = "dsffsdf")
    println(sum(4, 5, 2, 4))
    println(sum(5, 35, 3, 5, 3, 3))
    println("|-----Functions END-----|")
}

fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}
