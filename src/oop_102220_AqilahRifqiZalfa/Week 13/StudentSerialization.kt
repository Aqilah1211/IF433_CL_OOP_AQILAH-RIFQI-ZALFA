package oop_102220_AqilahRifqiZalfa.`Week 13`

import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)
fun Student.toCsv(): String = "$name,$age,$gpa"

fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(name = parts.trim(), age = parts[1].trim().toInt(), gpa = parts[2].trim().toDouble())
}