package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

open class Helden(val name: String, var hp: Int, val waffe: String, val element: String, var schaden: IntRange) {

    open fun aktionAusfuehren() {
        println(
            """
            Aktion bitte auswählen:
            1 -> Aktionen
            2 -> Beutelaktion
            
        """.trimIndent()
        )
        val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> aktionen(gegner.random())
            2 -> beutelAktion(beutel = Beutel())
            else -> println("Eingabe Falsch!")
        }
    }

    fun beutelAktion(beutel: Beutel) {
        println("Wählen Sie:\n* -> heiltrank\n# -> vitamine")
        val auswahl = readln()
        when (auswahl) {
            "*" -> beutel.heiltrank(helden.random())
            "#" -> beutel.vitamine(helden.random())
            else -> println("Eingabe Falsch!")
        }
    }

    open fun heilZauber() {
        println("Held heilt sich mit dem Heil Zauber.")
    }

    open fun aktionen(gegner: Gegner) {
        println("1 Held führt eine Attacke aus.")
        println(
            """
            "A" -> x
            "B" -> waffeAttacke
            "C" -> attacke3
            "D" -> Heil Zauber
            
        """.trimIndent()
        )
        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> x(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> attacke3(gegner)
            "D" -> heilZauber()
            else -> println("Eingabe Falsch!")
        }
    }

    open fun x(gegner: Gegner) {}

        open fun waffeAttacke(gegner: Gegner) {
            println("Ein Gegner wird mit 1 Waffe attackiert!")
        }

        fun attacke3(gegner: Gegner) {}


}