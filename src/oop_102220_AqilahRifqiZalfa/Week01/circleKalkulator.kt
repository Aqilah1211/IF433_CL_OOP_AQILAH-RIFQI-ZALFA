package oop_00000102220_AqilahRifqiZalfa.week01

fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

// Fungsi printReceipt ✨
fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("=======================")
}

fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 750000

    val discountPercent = calculateDiscount(price)
    val discountAmount = price * discountPercent / 100
    val finalPrice = price - discountAmount

    // Named Arguments ✨ (WAJIB!)
    printReceipt(title = gameTitle, finalPrice = finalPrice)
}