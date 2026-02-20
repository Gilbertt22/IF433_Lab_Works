package oop_00000125138_Gilbert.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    e.printStatus()

    println("\n--- Testing Tugas 1: Weapon ---")
    val w = Weapon("Excalibur")

    w.damage = -50
    println("Damage saat ini: ${w.damage}")

    w.damage = 9999
    println("Damage saat ini: ${w.damage}")

    println("Tier Senjata: ${w.tier}")
    println("\n--- Testing Tugas 2: Player ---")
    val p = Player("Gilbert_00000125138")
    
    p.addXp(50)
    println("Level saat ini: ${p.level}")

    p.addXp(60)
    println("Level saat ini: ${p.level}")

    p.addXp(-100)
    println("Level setelah input negatif: ${p.level}")
}