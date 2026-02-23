package oop_00000125138_Gilbert.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myTesla = ElectricCar(brand = "Tesla", numberOfDoors = 2, batteryCapacity = 85)
    myTesla.accelerate()
    myTesla.honk()

    println("\n--- Testing Tugas Mandiri 2 ---")

    val mgr = Manager("Gilbert Manager", 8000000, 5)
    mgr.work()
    println("Bonus Manager ${mgr.name}: Rp ${mgr.calculateBonus()}")

    val dev = Developer("Gilbert Developer", 7000000, "Kotlin")
    dev.work()
    println("Bonus Developer ${dev.name}: Rp ${dev.calculateBonus()}")
}