package from_youtube

// Variables
fun main() {
    println("--------------------------------------")
    //camelCase
    var userName: String
    userName = "Harish"
    println("Hello $userName")
    userName = "Jon"
//    println("Hello Harish!")
    val finalName = "Harish Mangeshkar"
//    finalName = "sdffs"  //val var cannot be changed
    var age: Int = 26
    println("Hello $finalName, your age is $age")
    println("--------------------------------------")

    // Byte, Short, Int, Long
    val nameX = "Harish"
    var number: Int = 22

    // INT - SIZE: 4 Bytes | 8 * 4 = 32 bits, RANGE: 2^32 => -2^31 to (2^31 -1)
    val maxIntValue = Int.MAX_VALUE
    val minIntValue = Int.MIN_VALUE
    println("INT -> min ($minIntValue), max ($maxIntValue)")
    number = 2147423234

    // BYTE - SIZE: 1 Bytes | 1 * 8 = 8 bits, RANGE: 2^8 => -2^7 to (2^7 -1)
    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    println("BYTE -> min ($minByteValue), max ($maxByteValue)")

    // SHORT - SIZE: 2 Bytes | 2 * 8 = 16 bits, RANGE: 2^16 => -2^15 to (2^15 -1)
    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    println("SHORT -> min ($minShortValue), max ($maxShortValue)")

    // LONG - SIZE: 8 Bytes | 8 * 8 = 64 bits, RANGE: 2^64 => -2^63 to (2^63 -1)
    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    println("Long -> min ($minLongValue), max ($maxLongValue)")

    // default number type is Int
    val myNum: Long = 2_847_249_274_920_000_900


    // Float, Double
    // FLOAT - SIZE: 4 Bytes | 8 * 4 = 32 bits, RANGE: 2^32 => -2^31 to (2^31 -1)
    val maxFloatValue: Float = Float.MAX_VALUE
    val minFloatValue: Float = Float.MIN_VALUE
    println("FLOAT -> min ($minFloatValue), max ($maxFloatValue)")

    // DOUBLE - SIZE: 8 Bytes | 8 * 8 = 64 bits, RANGE: 2^64 => -2^63 to (2^63 -1)
    val maxDoubleValue: Double = Double.MAX_VALUE
    val minDoubleValue: Double = Double.MIN_VALUE
    println("DOUBLE -> min ($minDoubleValue), max ($maxDoubleValue)")
    println("--------------------------------------")

    // Char
    val myCharValue: Char = 'D'
    println("$myCharValue")

    // Boolean
    var myBoolean: Boolean = false
    println("MyCharValue: $myCharValue - MyBooleanValue: $myBoolean")
    println("--------------------------------------")
}


