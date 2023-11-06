package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

open class Helden(val name: String, var hp: Int, val waffe: String, val element: String, var schaden: IntRange) {

    open fun aktionAusfuehren() {
        println(
            """
            Aktion bitte auswählen:
            1 -> [3]Aktionen
            2 -> Aktion "Heil Zauber"
            3 -> [2]Beutelaktion
            
        """.trimIndent()
        )
        val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> aktionen(gegner.random())
            2 -> heilZauber()
            3 -> beutelAktion(beutel = Beutel())
            else -> println("Eingabe nicht korrekt.")
        }
    }

    fun beutelAktion(beutel: Beutel) {
        println("Wählen Sie:\n1 -> heiltrank\n2 -> vitamine")
        val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> beutel.heiltrank(helden.random())
            2 -> beutel.vitamine(helden.random())
            else -> println("Ungültige Auswahl.")
        }
    }

    open fun heilZauber() {
        println("Held heilt sich mit dem Heil Zauber.")
    }

    open fun aktionen(gegner: Gegner) {
        println("1 Held führt eine Attacke aus.")
        println(
            """
            "A" -> queqsilberWolke
            "B" -> waffeAttacke
            "C" -> attacke3
            
        """.trimIndent()
        )
        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> queqsilberWolke(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> attacke3(gegner)
            else -> println("Eingabe nicht korrekt.")
        }
    }

    open fun queqsilberWolke(gegner: Gegner) {
        val attacke = "Queqsilber Wolke"
        val schaden = 25
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit dem Attacke: $attacke an," +
                    " fügt ${gegner.schaden} Schaden zu und reduziert die HP um ${gegner.hp}HP")
    }
        open fun waffeAttacke(gegner: Gegner) {
            val schaden = Random.nextInt(5..20)
            gegner.hp -= schaden
            println(
                "$name greift ${gegner.name} mit der $waffe an," +
                        " fügt Schaden zu und reduziert die" +
                        " HP.\njetzt hat gegner ${gegner.name} nur noch ${gegner.hp}HP übrig!")
        }

        fun attacke3(gegner: Gegner) {
            val schaden = Random.nextInt(5..20)
            gegner.hp -= schaden
            println(
                "$name greift ${gegner.name} mit der $waffe an," +
                        " fügt Schaden zu und reduziert die" +
                        " HP.\njetzt hat gegner ${gegner.name} nur noch ${gegner.hp}HP übrig!")
        }


}