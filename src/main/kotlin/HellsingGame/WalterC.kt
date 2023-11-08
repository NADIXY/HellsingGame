package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class WalterC(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    override fun heilZauber() {
        println("Aktion: heilZauber ")
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
            "doppelteBlitz" -> doppelteBlitz(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> reizZuTode(gegner)
            "D" -> heilZauber()
            else -> println("Eingabe Falsch!")
        }
    }

    fun doppelteBlitz(gegner: Gegner) {
        println("Aktion: doppelteBlitz ")
        if (gegner.hp >= 40 && (this.hp < 10)) {
            gegner.hp -= 35 * 2
            println(
                "Held ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig," + " wegen der Blitzt attacke des ${this.name}!"
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
        println("Aktion: waffeAttacke")
        val schaden = Random.nextInt(5..15)
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit der $waffe an," + " fügt Schaden zu und reduziert die" + " HP der Gegner." + "\n ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )
    }

    fun reizZuTode(gegner: Gegner) {
        println("Aktion: reizZuTode ")
        val schaden = 2 * Random.nextInt(schaden.first, schaden.last * 4)
        gegner.hp -= schaden
        println(
            "${this.name} zerstückelte Gegner ${gegner.name} mit scharfen Verfluchte Seiden: " + "\n${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )
    }

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