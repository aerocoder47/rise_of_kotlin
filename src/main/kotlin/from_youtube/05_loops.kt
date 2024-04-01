package from_youtube

fun mainForLoop() {
    println("---FOR LOOP---")
    for (i in 1..10) {
        print("i ->$i" + ",  ")
    }
    println()
    for (i in 1 until 10) {
        print("i ->$i" + ",  ")
    }
    println()
    for (i in 10 downTo 1) {
        print("i ->$i" + ",  ")
    }
    println()
    for (i in 10 downTo 1 step 2) {
        print("i ->$i" + ",  ")
    }
    println()
    for (i in 2..20 step 2) {
        print("i ->$i" + ",  ")
    }
    println("---FOR LOOP END---")
}

fun mainX() {
    println("---While Loop---")
    var number = 0
    while (number < 10) {
        number++
//        if (number == 7) continue
//        if (number in 3.. 7) continue
        if (number == 7) break
        print("num=>$number ")

    }
    println()
    for (i in 0..10) {
//        if (i in 3..8) continue
        if (i == 9) break
        print("i => $i ")
    }

    println()
//    number = 9
//    do {
//        println("Number => ${number++}")
//    } while (number < 10)
//
//    println("")

    println("---While Loop END---")
}

fun mainX2() {
    var num = 0
    outer@ while (num < 5) {
        num++
        println("num $num")
        var i = 0
        while (i < 5) {
            i++
            if (i == num) break@outer
            print("****$i ")
        }
        println()
    }
}

fun main() {
    var num = 1
    val lastNum = 20
    while (num <= lastNum) {
        if (num % 2 == 0)
            println("num -> $num is Even")
        num++
    }
}