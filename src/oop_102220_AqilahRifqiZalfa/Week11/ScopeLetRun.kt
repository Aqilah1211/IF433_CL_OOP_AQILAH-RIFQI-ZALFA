package oop_102220_AqilahRifqiZalfa.Week11


fun main() {
    val text: String? = "hello"

    // LET
    text?.let {
        println("Length: ${it.length}")
    }

    // RUN
    val result = text?.run {
        length * 2
    }

    println("Result: $result")
}