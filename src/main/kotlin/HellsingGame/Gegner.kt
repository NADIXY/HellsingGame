package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

open class Gegner(val name: String, var hp: Int, val waffe: String, val element: String, val schaden: IntRange) {

    open fun attacke1() {
        println("Gegner $name führt eine Attacke aus.")
    }

    open fun flaechenschaden(helden: Helden ) {
        println("Gegner $name fügt dem Helden_Team 'HELLSING' Flächenschaden zu.")
    }

    open fun fluch(held: Helden) {
        println("Gegner $name verflucht den Held ${held.name}.")
    }

    open fun waffeAngriff(helden: Helden) {
        println("Ein Held wird mit 1 Waffe attackiert!")
    }

    open fun aktionAusfuehren(helden: Helden) {
        /* val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> waffeAngriff(helden)
            2 -> flaechenschaden(helden)
            3 -> fluch(helden)
            else -> println("Ungültige Auswahl.")
        } */
    }

}
