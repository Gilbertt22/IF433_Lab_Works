package oop_00000125138_Gilbert.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Poin 2: Default Argument hp = 100
) {
    // Method untuk simulasi serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Method untuk menerima kerusakan (State Management)
    fun takeDamage(damage: Int) {
        hp -= damage
        // Logika Wajib: HP tidak boleh tembus angka minus
        if (hp < 0) {
            hp = 0
        }
    }

    // Method untuk mengecek status hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}