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

    println("\n--- Testing Electric Car ---")
    val myTesla = ElectricCar(brand = "Tesla", numberOfDoors = 2, batteryCapacity = 85)

    myTesla.accelerate()
    myTesla.honk()
    myTesla.openTrunk()
    // Testing Tugas Mandiri 2
    println("\n--- Testing Employee & Manager ---")
    val emp = Employee("Budi", 5000)
    emp.work()
    println("Bonus Budi: ${emp.calculateBonus()}")

    val mgr = Manager("Gilbert", 8000, 5)
    mgr.work()
    println("Bonus Manager ${mgr.name}: ${mgr.calculateBonus()}")
    // Lanjutan
    println("\n--- Testing Developer ---")
    val dev = Developer("Gilbert Dev", 7000000, "Kotlin")
    dev.work()

    println("Bonus Developer ${dev.name}: Rp ${dev.calculateBonus()}")
}