package oop_102220_AqilahRifqiZalfa.Week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- SYSTEM PEMINJAMAN BUKU ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Durasi Pinjam: ${loan.loanDuration} Hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")
}