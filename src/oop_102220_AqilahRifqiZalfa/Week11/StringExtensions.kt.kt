package oop_102220_AqilahRifqiZalfa.Week11

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c -> c.uppercase() }
    }
}
fun String?.safeLength(): Int {
    return this?.length ?: 0
}