package oop_00000125138_Gilbert.week03

fun main() {
    val e = Employee("Budi")
    e.salary = 5000000
    e.increasePerformance()
    e.printStatus()

    println("\n--- Testing Tugas 1: Weapon ---")
    val w = Weapon("Excalibur")
    w.damage = 9999
    println("Damage saat ini: ${w.damage}")
    println("Tier Senjata: ${w.tier}")

    println("\n--- Testing Tugas 2: Player ---")
    val p = Player("Gilbert_00000125138")

    p.addXp(50)
    println("Level saat ini: ${p.level}")

    p.addXp(60)
    println("Level saat ini: ${p.level}")
}