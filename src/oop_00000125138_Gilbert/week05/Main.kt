package oop_00000125138_Gilbert.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------")
    }

    val math = MathHelper()

    val hasilPersegi = math.hitungLuas(5)
    println("Hasil hitungLuas(5)          [Int]    : $hasilPersegi")

    val hasilPersegiPanjang = math.hitungLuas(10, 5)
    println("Hasil hitungLuas(10, 5)      [Int,Int]: $hasilPersegiPanjang")

    val hasilLingkaran = math.hitungLuas(7.0)
    println("Hasil hitungLuas(7.0)        [Double] : $hasilLingkaran")

    println("\n=== SIMULASI SISTEM PEMBAYARAN ===")

    val myEWallet = EWallet("Gilbert Wallet", 50000.0)
    val myCreditCard = CreditCard("Gilbert Visa", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)

        when (payment) {
            is EWallet -> {
                println("=> Tipe: E-Wallet")
                payment.topUp(50000.0)
            }
            is CreditCard -> {
                println("=> Tipe: Credit Card")
                println("=> Limit Tersisa: Rp${payment.creditLimit}")
            }
        }
        println("----------------------------")
    }
}
