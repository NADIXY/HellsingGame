package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class WalterC(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    override fun heilZauber() {
        hp += 20
        println(
            "${this.name} hat '20HP +' dazu bekommen, sich mit dem Schutz Zauber geschützt." + "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
        )
    }

    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
        println(
            """
            "A" -> xxx
            "B" -> waffeAttacke
            "C" -> attacke3
            "D" -> Heil Zauber
            
        """.trimIndent()
        )
        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> doppelteBliz(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> attacke3()
            "D" -> heilZauber()
            else -> println("Eingabe Falsch!")
        }
    }

    fun doppelteBliz(gegner: Gegner) {
        if (gegner.hp >= 40) {
            gegner.hp -= 35
            println(
                "Held ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
            )
        }
        for (gegnerAll in GEGNER1) {
            gegnerAll.hp -= 45
            println(
                "Held ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
            )
        }
    }

    override fun waffeAttacke(gegner: Gegner) {
        val schaden = Random.nextInt(5..15)
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit der $waffe an," +
                    " fügt Schaden zu und reduziert die" + " HP der Gegner." +
                    "\n ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )
    }

    fun attacke3() {}

    override fun beutelAktion(beutel: Beutel) {
        println("Wählen Sie:\n* -> heiltrank\n# -> vitamine")
        val auswahl = readln()
        when (auswahl) {
            "*" -> beutel.heiltrank(this)
            "#" -> beutel.vitamine(this)
            else -> println("Eingabe Falsch!")
        }
    }

}