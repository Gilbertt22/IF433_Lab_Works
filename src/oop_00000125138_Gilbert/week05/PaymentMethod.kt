package oop_00000125138_Gilbert.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}