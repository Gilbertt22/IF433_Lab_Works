package oop_00000125138_Gilbert.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()     // Memanggil method milik sendiri
    myCar.honk()          // Memanggil method Parent
    myCar.accelerate()     // Memanggil method Parent
}