package from_docs_kt/*
Types of numbers
1. Natural Numbers:
Numbers from 1 to infinity, zero and negative numbers excluded.
eg. 1, 2, 3,....
2. Whole Numbers:
Includes all the natural numbers along with zero.
eg. 0, 1, 2, 3, ....
3. Integers:
Includes Whole numbers along with their negative and zero.
eg. ..., -3, -2, -1, 0, 1, 2, 3, ...
4. Rational Numbers:
Numbers that can be expressed as a fraction where numerator
 and denominator are integers and denominator can't be zero.
eg. 1/2, -3/4, 5/-7, 0.25(1/4), etc.
5. Irrational Numbers:
Numbers that cannot be expressed as a fraction of integers.
They are non-repeating and non-terminating decimals.
Example: root-2, pi, e(Euler's number), etc.
6. Real Numbers:
Includes all rational and irrational numbers, meaning it includes
 every possible value on the number line.
eg. root-2, pi, -5,0, 3/4
7. Complex Numbers: These are numbers of the form a + bi,
where 'a' and 'b' are real numbers, and 'i' is the imaginary unit(root (-1)).
eg. 3 + 2i, -5 - i, 4i, etc.
*/

/*
// Binary -> Base-2 numbers, uses 0 n 1.

 */



/*
Integer types
4 types
    Type        Size(bits)          MinValue        MaxValue
1. Byte         8                   -128            127
2. Short        16                  -32k            +32k
3. Int          32                  -3^31          32^31 - 1
4. Long         64                  -2^63           2^63 - 1
*/

/*
Decimal - base-10 numbering system
- it utilises 10 distinct symbols 0 to 9
1. Base 10 systems:
- Decimal system is based on powers of 10, each digit in decimal number
represents a power of 10.
eg. decimal number 456 -> 4 * 10^2 + 5 * 10^1 + 6 * 10^0
2. Decimal Point:
- The decimal point is used to separate the integer part of the number
from its fractional part.
- for example, number 3.14, 3 is the integer part, and
 .14 is the fractional part
3. Fractional Representation
- Decimal can represent fractional values.
- The digit to the right of the decimal point indicates fraction of a whole.
- eg in the number 0.75, 0 represents no whole units,
    7 represents 7/10 or 7 tenths, 5 represents 5/100 or 5 hundredths,
    making the total 0.75
4. Positional Notation
- the value of each digit in a decimal number is determined by
its position within the number
- Digit to the left of the decimal point represents multiples of 10,
while digits to the right represents fractions of powers of 10
5. Applications
- Decimals are used extensively in everyday life for expressing quantities,
measurement and monetary values.
- Used in Mathematics, Science, Finance, and various fields where precision
 and accuracy in numerical representation are required.
 */

fun testNumbers() {
    val one = 1 //  Int
    val threeBillion = 3_000_000_000; //    Long
    val oneLong = 1L // Long
    val oneByte: Byte   =   1
}


// Floating point types
/*
Type        Size(bits)      Significant-bits        Exponent-bits       Decimal Digits
Float       32              24                      8                   6-7
Double      64              53                      11                  15-16
 */

fun testFloatingPoint(){
    val pi = 3.14 // Double
    val oneDouble = 1.0
//    val twoD: Double = 1
    val e = 2.7132423242342
    val efloat = 2.3443222F


    fun printDouble(d: Double) {print(d)}

    val i = 1
    val d = 1.0
    val f = 1.0f

    printDouble(i.toDouble())
    printDouble(f.toDouble())
    printDouble(d)

    // Kotlin also supports a conventional notation for floating-point numbers
    // Doubles by def - 123.5, 123.5E10
    // Float are tagged by f or F- 123.5F


    // Underscores to make number constants more readable:
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
}

// Literal constants for numbers
/*
1. Decimal: 123
2. Longs are tagged by a Capital L: 123L
3. Hexadecimals: 0x0F
5. Binaries: 0b00001011
 */

// Numbers representation on the JVM
/*
On the JVM platform numbers are stored as primitive types:
int, double, and so on.
Exceptions are cases when you create a nullable number reference
such as Int? or use generics.
In these cases numbers are boxed in Java classes Integer, Double n so on.
 */
fun testJVM(){
    var a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = ++a

    val b: Int = 1000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)

    // Operations on numbers
    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

    // Division of integers
    // division b/w integers numbers always returns integer,
    // any fraction part is discarded
    val x = 5 / 2
//println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    val x1 = 5 / 2.toDouble()
    println(x1 == 2.5) // return float
}

// Explicit number conversions

// Bit wise operations
fun bitwiseOp(){
    val x = (1 shl 2) and 0x000FF000
    println(x)
}

// Floating-point number comparison
/*
Equality check -> a == b and a != b
Comparison operator -> a < b, a > b, a <= b, a >= b
Range instantiation -> a..b, x in a..b, x !in a...b
 */


fun main() {
//    testJVM()

//    bitwiseOp()
}