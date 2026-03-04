package oop_00000102220_AqilahRifqiZalfa.week01

fun main() {
    var studentName = "John Doe"
    var score = 85.5
    var grade = ""

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

    println("Student: " + studentName + ", Score: " + score + ", Grade: " + grade)
}
