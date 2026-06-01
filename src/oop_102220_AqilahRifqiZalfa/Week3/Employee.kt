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