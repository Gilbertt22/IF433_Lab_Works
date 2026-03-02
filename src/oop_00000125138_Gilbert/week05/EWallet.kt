package oop_00000125138_Gilbert.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        println("[$accountName] Memproses pembayaran E-Wallet sebesar Rp$amount")
        if (balance >= amount) {
            balance -= amount
            println("=> Pembayaran Berhasil! Sisa saldo: Rp$balance")
        } else {
            println("=> Gagal: Saldo tidak cukup (Saldo saat ini: Rp$balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up sebesar Rp$amount. Saldo sekarang: Rp$balance")
    }
}