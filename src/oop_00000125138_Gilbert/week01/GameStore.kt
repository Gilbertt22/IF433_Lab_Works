package oop_00000125138_Gilbert.week01

fun main() {
    val gameTitle: String = "Resident Evil 4 Remake"
    val price: Int = 600000

    // Memanggil fungsi discount (untuk testing sementara)
    val discount = calculateDiscount(price)
}

// Langkah 2: Fungsi calculateDiscount menggunakan Expression Body
fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()