package oop_102220_AqilahRifqiZalfa.Week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Stat Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100
    val enemyName = "Goblin"

    while (hero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Pilihan: ")

        when (scanner.nextInt()) {
            1 -> {
                hero.attack(enemyName)
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("Sisa HP Musuh: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Musuh membalas! Menghasilkan $enemyDamage damage.")
                    hero.takeDamage(enemyDamage)
                    println("Sisa HP Hero: ${hero.hp}")
                }
            }
            2 -> {
                println("Anda memilih kabur!")
                break
            }
        }
    }

    println("\n=== BATTLE END ===")
    if (enemyHp <= 0) {
        println("Selamat, Anda Menang!")
    } else if (!hero.isAlive()) {
        println("Hero Anda kalah!")
    }
}