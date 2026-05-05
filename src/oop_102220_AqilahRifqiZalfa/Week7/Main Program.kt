package oop_102220_AqilahRifqiZalfa.Week7

fun main() {
    Koneksi.kon = "KnowBe4"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10, 20)
    Hitungan.kali(10, 20)
    println("Nama matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("User biasa")

    val dt = SaveData("Mario", 10, 100, 6)
    println("Nama char ${dt.namaChar}")
    println(dt)

    val dtCopy = dt.copy(namaChar = "Luigi")
    println("nama${dtCopy.namaChar}")
    println(dtCopy)

    println("=== CLASS ENUM ===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("--- SEALED CLASS ---")

    val hsl: Hasil = Hasil.Sukses("Berhasil Simpan!")
    hsl.handle_response(hsl)
}