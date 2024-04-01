package from_docs_kt

import java.io.File
import java.lang.IllegalStateException

// Create DTO's (POJOs/POCOs)
data class Customer(val name: String, val email: String, var age: Int)

// default values for functions parameters
fun foo(a: Int = 0, b: String = "") {
    println("a: $a, b: $b ")
}


fun main() {

    //region data class
//    val harish = Customer("Harish Mangeshkar", "hm@gmail.com", 26)
//    println(harish.email)
//    println(harish.name)
//    harish.age = 27
//    println(harish.toString())
//    println(harish.hashCode())
    //endregion

    //region Filter list

    val listNum = listOf(1,2,3,4,5,-4,-2,0,-1)
    val positives = listNum.filter { x -> x>0 }
    println(listNum)
    println(positives)


    // check for presence of an element in a collection
    val emaillist = listOf("jon@example.com", "h@gm.com")
    if ("jon@example.com" in emaillist) {
        println("Yes")
    }
    if ("jon@example.com" !in emaillist) {
        println("No")
    }


    //String interpolation
    val name = "Harish"
    println("Name $name")

    val x: Any = "String"
    when (x) {
        is Int -> print("Int")
        is String -> print("Sting")
        else -> print("Unknown")
    }
    println()
    // read only list
    val list = listOf("A", "B", "C")
    // Read-only map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    // access map entry
    println("MapKey: " + map["key"])

    // Traverse a map or a list of pairs
    for ((k, v) in map) {
        println("$k -> $v")
    }
    // Iterate over a range
    for (i in 1..100) {
    }
    for (i in 1..<100) {
    }
    for (x in 2..10 step 2) {
    }
    for (x in 10 downTo 1) {
    }
    (1..10).forEach { }

    //Lazy Property
    val p: String by lazy {
        // the value is computed only on first acess
         "sdfsdfs"
    }

    // extension function
    fun String.spaceToCamelCase() {}
    "Convert this to camelcase".spaceToCamelCase()
}

// Create a singleton
object Resource {
    val name = "Name"
}

// Instantiate an Abstract class
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

fun main1(){
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            TODO("Not yet implemented")
        }

        override fun sleep() {
            TODO("Not yet implemented")
        }

    }

    myObject.doSomething()

    // if-not-null shorthand
    val files = File("Test").listFiles()
    println(files?.size)
}

// if-not-null-else shorthand
fun main3() {
    val files = File("test").listFiles()
    //for simple fallback values
    println(files?.size ?: "empty") // if files is null, this prints empty

    // to calculate a more complicated fallback value in a code block, use 'run'
    val fileSize = files?.size ?: run {

    }

    // Execute a statement if null
    val values = mapOf("email" to "hm@gmail.com")
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")


    // Get first item of a possibly empty collection
    val emails = listOf(null)
    val mainEmail  = emails.firstOrNull()

    // execute if not null
    val value = listOf("a", "b")
    value?.let {

    }

}


fun testTurtle() {
    class Turtle {
        fun penDown() {}
        fun penUp(){}
        fun turn(degrees: Double) {}
        fun forward(pixels: Double) {}
    }


    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4){
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}