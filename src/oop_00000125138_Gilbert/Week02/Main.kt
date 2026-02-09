package oop_00000125138_Gilbert.Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PERPUSTAKAAN ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Peringatan: Durasi minus tidak valid. Otomatis diubah ke 1 hari.")
        duration = 1
    }

    val myLoan = Loan(title, name, duration)

    println("\n--- Detail Peminjaman ---")
    println("Judul Buku     : ${myLoan.bookTitle}")
    println("Nama Peminjam  : ${myLoan.borrower}")
    println("Lama Pinjam    : ${myLoan.loanDuration} hari")
    println("Total Denda    : Rp ${myLoan.calculateFine()}")
}