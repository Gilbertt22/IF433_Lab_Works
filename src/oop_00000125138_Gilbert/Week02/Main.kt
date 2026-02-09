package oop_00000125138_Gilbert.Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- WELCOME TO MINI RPG ---")
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val dmg = scanner.nextInt()

    val myHero = Hero(name, dmg)
    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n=== STATUS PERTEMPURAN ===")
        println("HP ${myHero.name}: ${myHero.hp} | HP Musuh: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            myHero.attack("Musuh")
            enemyHp -= myHero.baseDamage
            println("Musuh menerima ${myHero.baseDamage} damage. Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val monsterDmg = (10..20).random()
                println("Musuh membalas! $name terkena $monsterDmg damage.")
                myHero.takeDamage(monsterDmg)
            }
        } else if (choice == 2) {
            println("Kamu melarikan diri dari medan perang... Pengecut!")
            break
        } else {
            println("Pilihan salah! Kamu bengong dan diseruduk musuh.")
            myHero.takeDamage(5)
        }
    }

    println("\n--- HASIL AKHIR ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("SELAMAT! ${myHero.name} memenangkan pertarungan!")
    } else if (!myHero.isAlive()) {
        println("GAME OVER... ${myHero.name} telah gugur di medan laga.")
    } else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}