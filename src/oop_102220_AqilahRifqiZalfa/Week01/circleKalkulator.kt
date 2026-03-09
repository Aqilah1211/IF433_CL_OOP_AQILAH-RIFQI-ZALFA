package oop_00000102220_AqilahRifqiZalfa.week01

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

// Hapus parameter args yang tidak dipakai ✨
fun main() {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}