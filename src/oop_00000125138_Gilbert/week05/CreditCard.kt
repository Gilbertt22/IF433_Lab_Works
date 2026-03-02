package oop_00000125138_Gilbert.week05

class CreditCard(accountName: String, var creditLimit: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        println("[$accountName] Memproses pembayaran Kartu Kredit sebesar Rp$amount")
        if (creditLimit >= amount) {
            creditLimit -= amount
            println("=> Pembayaran Berhasil! Sisa limit kredit: Rp$creditLimit")
        } else {
            println("=> Gagal: Limit kredit tidak mencukupi (Limit saat ini: Rp$creditLimit")
        }
    }

    fun installment(months: Int) {
        println("[$accountName] Berhasil mengatur cicilan selama $months bulan.")
    }
}