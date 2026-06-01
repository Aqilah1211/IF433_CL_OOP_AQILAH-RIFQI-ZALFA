package oop_102220_AqilahRifqiZalfa.Week3

class Employee (val name: String) {
    var salary: Int = 0
}
package oop_102220_AqilahRifqiZalfa.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}
class Employee (val name: String) {
    var salary: Int = 0
        set (value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}