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

////////////////////////////////////////////////////

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

fun mainEx1() {
    val tesla = Car("Tesla", "Model X", "Red", 4)
    val mustang = Car("Ford", "Mustang", "Grey", 4)
    tesla.move()
    tesla.stop()
    mustang.move()
    mustang.stop()
}

////////////////////////////////////////////////////
fun main() {
    val user1 = User("Harish", "Mangeshkar", 26)
    val user2 = User("Arsene", "Mangeshkar", 26)


}

class User(name: String, var lastName: String, var age: Int) {
    var name: String
    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "user"
            println("Name doesn't start with letter 'A' or 'a' for $name")
        }
    }
}