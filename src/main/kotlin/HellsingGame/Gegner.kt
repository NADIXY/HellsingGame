package HellsingGame

import kotlin.random.Random

open class Gegner(val name: String, var hp: Int, val waffe: String, val element: String, val schaden: IntRange) {



    open fun attacken() {
        println("Gegner $name führt eine Attacke aus.")
    }

    fun flaechenschaden(teams: Teams) {
        println("Gegner $name fügt dem Team Flächenschaden zu.")
    }

    fun fluch(held: Helden) {
        println("Gegner $name verflucht den Helden ${held.name}.")
    }

    open fun angriff(helden: Helden) {
        val schaden = Random.nextInt(schaden.first, schaden.last + 1)
        helden.hp -= schaden
        println("$name greift ${helden.name} mit $waffe an," +
                " fügt ${helden.schaden} Schaden zu und reduziert die" +
                " HP der ${helden.name} um ${helden.hp}.")
    }

        open fun leistung(aktionIndex: Int, helden: Helden) {
            when (aktionIndex) {
                1 -> angriff(helden)
                else -> println("Ungültige Auswahl.")
            }
        }

}