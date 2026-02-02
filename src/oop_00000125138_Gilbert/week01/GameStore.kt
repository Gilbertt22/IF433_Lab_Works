package oop_00000125138_Gilbert.week01

fun main() {
    val gameTitle: String = "Resident Evil 4 Remake"
    val price: Int = 600000

    val discount = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = price - discount
    )
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("--- STEAMKW RECEIPT ---")
    println("Game: $title")
    println("Original Price: Rp $originalPrice")
    println("Final Price: Rp $finalPrice")
    println("-----------------------")
}