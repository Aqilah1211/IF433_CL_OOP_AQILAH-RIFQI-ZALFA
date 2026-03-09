package oop_00000102220_AqilahRifqiZalfa.week01

// Ubah fungsi menjadi Expression Body & mengembalikan String ✨
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    // Panggil fungsi di dalam println ✨
    println(checkSize(area))
}