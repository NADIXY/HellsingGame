package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

open class Gegner(val name: String, var hp: Int, val waffe: String, val element: String, val schaden: IntRange) {

    open fun attacke() {
        println("Gegner $name führt eine Attacke aus.")
    }

    open fun flaechenschaden(helden: Helden ) {
        println("Gegner $name fügt dem Helden_Team 'HELLSING' Flächenschaden zu.")
    }

    open fun fluch(held: Helden) {
        println("Gegner $name verflucht den Helden ${held.name}.")
    }

    open fun angriff(helden: Helden) {
        val schaden = Random.nextInt(80..150)
        helden.hp -= schaden
        println(
            "$name greift ${helden.name} mit $waffe an," +
                    " fügt Schaden zu und reduziert ${helden.name}'s um ${helden.hp}HP."
        )
    }

    open fun aktionAusfuehren(helden: Helden) {
        println(
            """
            Aktion bitte auswählen:
            1 -> Angriff
            2 -> Flächenschaden
            3 -> Fluch

        """.trimIndent()
        )
        val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> angriff(helden)
            2 -> flaechenschaden(helden)
            3 -> fluch(helden)
            else -> println("Ungültige Auswahl.")
        }
    }

}
