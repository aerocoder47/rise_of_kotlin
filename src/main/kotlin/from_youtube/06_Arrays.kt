package from_youtube

fun mainArray() {
    val names: Array<String> = arrayOf("Jon", "Stephen", "Megan")
    println("1st => ${names[0]}")
    println("2nd => ${names[1]}")
    println("3rd => ${names[2]}")
    println("Size of array is => ${names.size}")

    val number = arrayOf(1, 2, 3, 4, 5)
    val mixData = arrayOf(1, false, 5, "Jon", 'J', '0', 'N')

    for (name in names) {
        print("Name => $name ")
    }
    println()
    for (indx in names.indices) {
        print("Names => ${names[indx]} ")
    }
    println()
    for (v in mixData) {
        if (v is Char || v is String)
            print("v=> $v ")
    }
    println()

}

fun main() {
    val ar = arrayOf(1,3,-20,20, 200, 20)
    println("Max ${getMaxValueArray(ar)}, Min ${getMinValueArray(ar)}")
    val minMaxPair = getMinMax(ar)
    println("Min,Max => $minMaxPair," +
            " max=> ${minMaxPair.first}, min=> ${minMaxPair.second}")
}

fun getMaxValueArray(array: Array<Int>): Int {
    var max = Int.MIN_VALUE
    array.forEach {
        if (max < it)
            max = it
    }
    return max
}

fun getMinValueArray(array: Array<Int>): Int {
    var min = Int.MAX_VALUE
    array.forEach {
        if (min > it)
            min = it
    }
    return min
}

fun getMinMax(arr: Array<Int>): Pair<Int, Int> {
    return Pair(getMaxValueArray(arr), getMinValueArray(arr))
}