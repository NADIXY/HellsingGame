package HellsingGame

import kotlin.random.Random

open class Gegner(val name: String, var hp: Int, val waffe: String, val element: String, val schaden: IntRange) {
    //fun auswahlAktion() {
       // val aktionIndex = Random.nextInt(aktionen.size)
        //aktion = ""
    //}

    open fun leistung(aktionIndex: Int, helden: Helden) {
        when (aktionIndex) {
            1 -> angriff(helden)
            //2 -> auswahlAktion()
            else -> println("Ungültige Auswahl.")
        }
    }


    open fun attacken() {
        println("Gegner $name führt eine Attacke aus.")
    }

    fun flaechenschaden(heldenTeam: HeldenTeam) {
        println("Gegner $name fügt dem Team Flächenschaden zu.")
    }

    fun fluch(held: Helden) {
        println("Gegner $name verflucht den Helden ${held.name}.")
    }

    open fun angriff(helden: Helden) {
        val schaden = Random.nextInt(schaden.first, schaden.last + 1)
        helden.hp -= schaden
        println("$name greift ${helden.name} mit $waffe an und fügt ${helden.schaden} Schaden zu.")
    }

}