package oop_00000102220_AqilahRifqiZalfa.week01

// Fungsi terpisah dengan Expression Body ✨
fun calculateStatus(score: Double) = if (score >= 75) "Lulus" else "Tidak Lulus"

fun main() {
    val studentName = "John Doe"
    val score = 85.5

    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "E"
    }

    val status = calculateStatus(score)
    println("Student: $studentName, Score: $score, Grade: $grade, Status: $status")
}