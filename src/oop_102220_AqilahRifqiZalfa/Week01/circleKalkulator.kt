package oop_00000102220_AqilahRifqiZalfa.week01

fun main(args: Array<String>) {
    // Ubah var menjadi val + Type Inference ✨
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    // String Template ✨
    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}