package oop_00000125138_Gilbert.week10

interface Nameable {
    val name: String
}

data class Coin(
    override val name: String,
    val balance: Double
) : Nameable

data class Transaction(
    val id: String,
    val amount: Double
)