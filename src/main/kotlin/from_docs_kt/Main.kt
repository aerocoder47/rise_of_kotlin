package from_docs_kt

fun main(args: Array<String>) {
    println("Hello World!")
}

// region Function
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    print("Sum of $a + $b = ${a + b}")
}

fun printSum1(a: Int, b: Int) {
    print("Sum of $a + $b = ${a + b}")
}
//endregion


// region Variable
fun vars() {
    val a: Int = 1;
    val b = 2
    val c: Int
    c = 5
    var x = 5
    x += 1
}

// Declare variables at top level
val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

//endregion


// Creating classes and instances
//class Shape

class Rectangle(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2

}

fun testClass() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")

}

// Inheritance
open class IShape

class IRectangle(val height: Double, val length: Double) : IShape() {
    val perimeter = (height + length) * 2
}

// This is an end-of-line comment
/*
This is a block comment
on multiple lines.
*/

/* The comment starts here
/*  Contains a nested comment */
 and ends here*/

// String templates
fun stringTest() {
    var a = 1
    // simple name in template
    val s1 = "a is $a"
    a = 2
    //  arbitrary expression in template
    val s2 = "${s1.replace("is", "was")}, but now is $a"
}

//  Conditional expression
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOF1(a: Int, b: Int) = if (a > b) a else b

// For loop
fun testLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("Item at $index is ${items[index]}")
    }

    var index = 0
    while (index <= items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }
}

// when expression
fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unkown"
    }

//  Ranges
fun testRange() {
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("Fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        print("-1 is not of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

// Iterate over a range
fun testIteration() {
    for (x in 1..5) {
        println(x)
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 10..1 step 2) {
        print(x)
    }

    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

// Collections
fun testCollection() {
    val items = listOf("A", "B", "C", "D", "E", "F")
    for (item in items) {
        println(item)
    }

    when {
        "orange" in items -> println("Juicy")
        "apple" in items -> println("apple is fine too")
        "A" in items -> println("A is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }


    // Nullable values and null checks
    fun parseInt(str: String): Int? {
        return null
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x != null && y != null) {
            print(x * y)
        } else {
            println("$arg1 or $arg2 is not a number")
        }

        if (x == null) {
            println("Wrong number format in arg1: $arg1")
            return
        }
        if (y == null) {
            println("Wrong number format in arg2: $arg2")
            return
        }

        println(x * y)
    }


}


// Type checks and automation casts
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStrLength(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}

fun getStrLen(obj: Any): Int? {
    if (obj is String && obj.length > 0) return obj.length
    return null
}
