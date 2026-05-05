package oop_102220_AqilahRifqiZalfa.Week7

enum class Arah(val petunjuk: String) {
    Atas("Naik"), Bawah("Turun"), Kiri("Belok"), Kanan("Mengsong");

    fun tampilkan_isi_param() {
        println("Arah ke $petunjuk")
    }
}