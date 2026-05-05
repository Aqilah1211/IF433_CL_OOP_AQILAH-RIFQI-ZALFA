package oop_102220_AqilahRifqiZalfa.`Week 8`

fun main() {
    val order = Order(Customer(Address("Jakarta")))

    // Safe Call and Elvis Operator
    val city = order.customer?.address?.city ?: "Unknown City"
    println(city)

    // Safe Call with let
    order.customer?.address?.city?.let {
        println("City found: $it")
    }

    // List with mixed types
    val mixedList = listOf("Hello", 123, true, "World")

    // Safe Cast (as?) with null check
    for (item in mixedList) {
        val text = item as? String
        if (text != null) {
            println(text)
        }
    }

    // Safe Cast with Elvis Operator
    for (item in mixedList) {
        val text = item as? String ?: "Not String"
        println(text)
    }
}
