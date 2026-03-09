package oop_00000102220_AqilahRifqiZalfa.week01

fun main() {
    val studentName = "John Doe"
    val score = 85.5

    // when sebagai Expression (mengembalikan nilai langsung) ✨
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "E"
    }

    println("Student: $studentName, Score: $score, Grade: $grade")
}