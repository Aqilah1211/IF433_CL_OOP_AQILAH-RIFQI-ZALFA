package oop_102220_AqilahRifqiZalfa.Week9

fun main() {
    println("======= LIST OF =======")
    val arMhs = listOf("Budi", "Susi", "Titus")
    println(arMhs)
    println("panjang List ${arMhs.size}")
    println(arMhs[1])
    for (a in arMhs) {
        println("mahasiswa bernama: $a")
    }

    println("======= MUTABLE LIST =======")
    val arAngka = mutableListOf(10, 30, 40, 20, 90, 100, 15)
    println(arAngka)

    arAngka.add(777)

    arAngka[2] = 123

    arAngka.removeAt(3)

    println(arAngka)

    println("======= SET OF =======")
    val arUrutan = setOf(20, 30, 40, 20, 70, 30, 10, 100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga?" + arUrutan.contains(40))

    println("======= MUTABLE SET OF =======")
    val arMakanan = mutableSetOf("Nasi", "Bakpao", "Mie", "Ayam", "Ikan")
    arMakanan.add("Ketoprak")
    arMakanan.remove("Mie")
    arMakanan.add("Mie")
    println(arMakanan)

    println("======= MAP OF =======")
    val arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )
    println("Banyak data siswa: " + arSiswa.size)
    println("Nilai si Andi" + arSiswa["Andi"])
    println("semua keys: " + arSiswa.keys)
    println("semua values: " + arSiswa.values)
    println("Nama siswa index 1: " + arSiswa.keys.elementAt(1))
    println(arSiswa)

    println("======= MUTABLE MAP OF =======")
    val arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur asem" to 1500
    )
    println("banyak menu: " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu["Udang"] = 2300
    println(arMenu)

    println("======= LAMBDA =======")
    fun tambah(a:Int, b:Int):Int {
        return a+b
    }
    var kurang = {a:Int, b: Int -> a-b}

    println("kurang-kurangan: ${kurang(5,3)}")

    var pangkat = {x:Int -> x*x}
    var hitungPangkat:(Int) -> Int = {it * it}
    println("Pangkat " + hitungPangkat(5))

    arSiswa.forEach {
            siswa -> println(siswa)
    }
    for(sis in arSiswa){
        println(sis)
    }
}