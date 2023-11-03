package HellsingGame

import kotlin.random.Random

class AlexandersHelfer(name: String, hp: Int, waffe: String, element: String, schaden: IntRange): Gegner(name,hp,waffe,element,schaden){


    override fun leistung(aktionIndex: Int, helden: Helden) {
        when (aktionIndex) {
            1 -> angriff(helden)

            else -> println("Ungültige Auswahl.")
        }
    }
    override fun attacken() {
        println("Unterboss ${this.name} führt eine Attacke aus.")
    }

    override fun angriff(helden: Helden) {
        val schaden = Random.nextInt(schaden.first, schaden.last + 1)
        helden.hp -= schaden
        println("$name greift ${helden.name} mit $waffe an und fügt ${helden.schaden} Schaden zu.")
    }


}