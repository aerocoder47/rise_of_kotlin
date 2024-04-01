package from_youtube

fun main() {
    var isActive = true
    var myNum = 10
    if (isActive == true) {
        println("The user is active")
    } else {
        println("The user is not active")
    }

    if (myNum > 150) {
        println("Greater than 150")
    } else {
        println("Lesser than 150")
    }

    var greaterThan = 100 > 5
    var greaterEqualTo = 100 >= 5
    var exactEqual = 100 == 5
    var lessThan = 100 < 5
    var lessThanOrEqual = 100 <= 5


    // LOGICAL NOT Operator
    // ! =
    var notEqual = 5 != 8

    isActive = true
    if (isActive) {
        println("user active")
    } else {
        println("user not active")
    }

    if (isActive) println("user active") else println("user not active")

    // Logical AND OR operator
    var isPlayin = true
    val score = 80

    if (isPlayin && score == 100) {
        println("Next level opened")
    } else {
        println("Still at the same level")
    }
    if (isPlayin || score == 100) {
        println("Next level opened")
    } else {
        println("Still at the same level")
    }

    val num1 = 5
    val num2 = 4
    if (num1 > 0 || num2 > 0) {
        println("Condition is true")
    } else {
        println("Condition is false")
    }

    var text = if (num1 > 0) "Greater than 0" else "Less than 0"
    var text1 = if (num1 > 0) "Greater than 0" else 0

    /*
    Control Flow
     */
    println("------Control flow ------")

    val alarm = 12

    // alarm ==
    when (alarm) {
        12, 13 -> println("The time is $alarm")
        in 5..7 -> println("The time is $alarm")
        !in -5..7 -> println("The time is $alarm")
        is Int -> println("The time is Int")
        8 -> println("The time is $alarm")
        14 -> println("The time is $alarm")

        else -> println("The time is $alarm")
    }
    // when as expression
    var startsWith = 'A'
    var getFruit = when (startsWith) {
        'A' -> "Apple"
        'B' -> "Banana"
        'C' -> "Cactus"
        else -> "Not A Fruit"
    }
    println("Fruit Name -> $getFruit")

    // when as if else
    var whenAsIf = when {
        startsWith == 'A' -> "Apple"
        startsWith == 'B' -> "Banana"
        startsWith == 'C' -> "Cactus"
        else -> "Not a fruit"
    }

    /*
    Nullability
     */
    println("----Nullability-----")
    var text2: String? = null
    println(text2)
    println(text2?.length ?: "Shit it was null")

    var text3: String? = text2 ?: "Some Text"
    println(text3!!.length)





}