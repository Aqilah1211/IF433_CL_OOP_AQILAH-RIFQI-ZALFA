package oop_102220_AqilahRifqiZalfa.`Week 8`

package oop.nim.nama.week08

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)
}