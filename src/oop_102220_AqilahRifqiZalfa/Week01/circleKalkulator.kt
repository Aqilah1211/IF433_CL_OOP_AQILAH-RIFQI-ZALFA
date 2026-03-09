package oop_00000102220_AqilahRifqiZalfa.week01

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

// Fungsi printReceipt dengan parameter note (nullable + default value) ✨
fun printReceipt(title: String, finalPrice: Int, note: String? = null) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    // Elvis Operator untuk null safety ✨
    println("Catatan: ${note ?: "Tidak ada catatan"}")
    println("=======================")
}

fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 750000

    // Nullable variable ✨
    val userNote: String? = null

    val discountPercent = calculateDiscount(price)
    val discountAmount = price * discountPercent / 100
    val finalPrice = price - discountAmount

    // Named Arguments + nullable note ✨
    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}