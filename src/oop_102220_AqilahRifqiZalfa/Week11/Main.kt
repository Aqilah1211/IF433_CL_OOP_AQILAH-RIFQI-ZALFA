package oop_102220_AqilahRifqiZalfa.Week11


fun main() {
    val name = "aqil rifqi"
    println(name.toTitleCase())

    val text: String? = null
    println(text.safeLength())
}
fun main() {

    val user = User().apply {
        name = "Aqil"
        age = 20
    }
}
user.also {
    println("User dibuat: $it")
}
with(user) {
    println(name)
    println(age)
}