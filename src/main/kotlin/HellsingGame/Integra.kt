package HellsingGame

import HellsingGame.Gegner.Gegner
import kotlin.random.Random
import kotlin.random.nextInt

class Integra(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    override fun heilZauber() {
        println("Aktion: heilZauber ")
        hp += 30
        println(
            "${this.name} hat '30HP +' dazu bekommen, sich mit dem Schutz Zauber geschützt." + "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
        )
    }

    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
        println(
            """
            "A" -> queqsilber
            "B" -> waffeAttacke
            "C" -> silverBombe
            "D" -> Heil Zauber
            
        """.trimIndent()
        )

        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> queqsilber(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> silverBombe(gegner)
            "D" -> heilZauber()
            else -> println("Eingabe Falsch!")
        }
    }

    fun queqsilber(gegner: Gegner) {
        println("Aktion: Queqsilber Attacke ")
        for (gegnerx in GEGNER1) {
            gegnerx.hp -= (2 * 24)
            println(
                "Queqsilber Attacke wirkt 2 Tage lang..." + "\nHeld ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
            )
        }
    }

    override fun waffeAttacke(gegner: Gegner) {
        println("Aktion: waffeAttacke")
        val schaden = Random.nextInt(40..50)
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit der $waffe an," + " fügt Schaden zu und reduziert die" + " HP der Gegner.\n ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )
    }

    fun silverBombe(gegner: Gegner) {
        println("Aktion: silverBombe Attacke")
        if (gegner.hp >= 30 && (this.hp < 80)) {
            gegner.hp -= 35 * 2
            println(
                "Held ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig," + " wegen der silverBombe attacke des ${this.name}!"
            )
        }
        for (gegnerAll in GEGNER1) {
            gegnerAll.hp -= 45
            println(
                "Held ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
            )
        }
    }
    private var heitrankAusgenutzt = false
    private var vitamineAusgenutzt = false

    override fun beutelAktion(beutel: Beutel) {
        if (heitrankAusgenutzt && vitamineAusgenutzt ) {
            throw  Exception("Die Funktion wurde bereits aufgerufen!")
        }
        println("Wählen Sie:\n* -> heiltrank\n# -> vitamine")
        val auswahl = readln()
        when (auswahl) {
            "*" -> if(!heitrankAusgenutzt) beutel.heiltrank(this)
            "#" -> if(!vitamineAusgenutzt) beutel.vitamine(this)
            else -> println("Eingabe Falsch!")
        }
        heitrankAusgenutzt = true
        vitamineAusgenutzt = true
    }

}