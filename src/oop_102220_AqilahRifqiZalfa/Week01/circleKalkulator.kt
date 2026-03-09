package oop_00000102220_AqilahRifqiZalfa.week01

// Fungsi diskon dengan Expression Body ✨
fun calculateDiscount(price: Int): Int = if (price > 500000) 20 else 10

fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 750000

    val discountPercent = calculateDiscount(price)
    val discountAmount = price * discountPercent / 100
    val finalPrice = price - discountAmount
}