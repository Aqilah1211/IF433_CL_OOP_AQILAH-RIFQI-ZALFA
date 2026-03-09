package oop_00000102220_AqilahRifqiZalfa.week01

// Fungsi terpisah dengan Expression Body ✨
fun calculateStatus(score: Double) = if (score >= 75) "Lulus" else "Tidak Lulus"

fun main() {
    val studentName = "John Doe"
    val score: Double? = 85.5  // Nullable type (bisa null) ✨

    // Safe Call (?.) + Elvis Operator (?:) ✨
    val safeScore = score ?: 0.0

    val grade = when {
        safeScore >= 90 -> "A"
        safeScore >= 80 -> "B"
        safeScore >= 70 -> "C"
        safeScore >= 60 -> "D"
        else -> "E"
    }

    val status = calculateStatus(safeScore)

    // Simulasi nullable note
    val note: String? = null
    println("Student: $studentName, Score: $safeScore, Grade: $grade, Status: $status, Note: ${note ?: "Tidak ada catatan"}")
}