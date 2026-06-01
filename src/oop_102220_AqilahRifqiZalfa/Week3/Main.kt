package oop_102220_AqilahRifqiZalfa.Week3

class Employee(val name: String) {
    var salary: Long = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Gaji tidak boleh negatif!")
            } else {
                field = value
            }
        }

    private var performanceScore: Int = 0

    fun increasePerformance() {
        performanceScore += 10
        println("$name sedang meningkatkan performa!")
    }

    val tax: Double
        get() = salary * 0.1
}

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")
}
