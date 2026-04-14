package oop_102220_AqilahRifqiZalfa.`Week 8`

package oop.nim.nama.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)
}
order.customer?.address?.city?.let {
    println("City found: $it")
}
val mixedList = listOf("Hello", 123, true, "World")