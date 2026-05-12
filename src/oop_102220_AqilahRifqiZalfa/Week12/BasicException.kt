package oop_102220_AqilahRifqiZalfa.Week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}
fun main() {
    // Latihan Langkah 2: try sebagai Expression
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }

    println("Hasil parsing: $result")

    // Test fungsi divide untuk melihat finally bekerja
    println("\n=== TEST DIVIDE FUNCTION ===")
    divide(10, 0)
}
