package from_youtube

import java.awt.Color

fun mainEx() {

    val carEx1 = CarEx()
    carEx1.name = "Tesla"
    carEx1.model = "S Plaid"
    carEx1.color = "Red"
    carEx1.doors = 4
    println("Name: ${carEx1.name}, Model: ${carEx1.model}, Color: ${carEx1.color}, Doors: ${carEx1.doors}")
    carEx1.move()
    carEx1.stop()

}

class CarEx {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("Car: $name is moving")
    }

    fun stop() {
        println("Car: $name has stopped")
    }

}

class Car(
    var name: String,
    var model: String,
    var color: String,
    var door: Int
) {
    fun move() {
        println("Car: $name is moving")
    }

    fun stop() {
        println("Car: $name is stopping..")
    }
}

fun main() {
    val tesla = Car("Tesla", "Model X", "Red", 4)
    val mustang = Car("Ford", "Mustang", "Grey", 4)
    tesla.move()
    tesla.stop()
    mustang.move()
    mustang.stop()
}