package oop_00000102220_AqilahRifqiZalfa.week01

fun main() {
    // Ubah var menjadi val (immutable)
    val studentName = "John Doe"
    val score = 85.5
    var grade = ""  // grade tetap var karena akan diubah

    if (score >= 90) {
        grade = "A"
    } else if (score >= 80) {
        grade = "B"
    } else if (score >= 70) {
        grade = "C"
    } else if (score >= 60) {
        grade = "D"
    } else {
        grade = "E"
    }

    // Gunakan String Template ($) instead of (+)
    println("Student: $studentName, Score: $score, Grade: $grade")
}