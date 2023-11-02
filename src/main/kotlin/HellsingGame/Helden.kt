package HellsingGame

import kotlin.random.Random

open class Helden(val name: String, var hp: Int, val waffe: String, val element: String, var schaden: IntRange) {

    open fun aktionAusfuehren(gegner: Gegner) {
        println("""
            
            Aktion bitte auswählen:
            1 -> Angriff
            2 -> Heilung
            3 -> Beutelaktion
            
        """.trimIndent())

        val auswahl = readln().toIntOrNull()

        when (auswahl) {
            1 -> angriff(gegner)
            2 -> heilung()
            3 -> beutelAktion(Beutel())
            else -> println("Eingabe nicht korrekte.")
        }
    }

    open fun attacken() {
        println("Held führt eine Attacke aus.")
    }


    //fun aktionAusfuehren(aktionIndex: Int, ziel: gegner) {}
    //open fun zaubertrank(heilung: Heilung, beschreibung: String, trinken: Helden) {}
    open fun angriff(gegner: Gegner) {
        val schaden = Random.nextInt(schaden.first, schaden.last + 1)
        gegner.hp -= schaden
        println("$name greift ${gegner.name} mit $waffe an und fügt $schaden Schaden zu.")
    }

    open fun heilung() {}

    open fun beutelAktion(beutel: Beutel) {}

}