package HellsingGame


import HellsingGame.Gegner.Gegner
import kotlin.random.Random
import kotlin.random.nextInt

class Alucard(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    override fun heilZauber() {
        println("Aktion: heilZauber ")
        hp += 50
        println(
            "${this.name} hat '50HP +' dazu bekommen sich mit dem Schutz Zauber geschützt." +
                    "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
        )
    }

    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
        println(
            """
            "A" -> darkHundTransit
            "B" -> waffeAttacke
            "C" -> wolfAttacke
            "D" -> Heil Zauber
            
        """.trimIndent()
        )
        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> darkHundTransit(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> wolfAttacke(gegner)
            "D" -> heilZauber()
            else -> println("Eingabe Falsch!")
        }
    }


    fun darkHundTransit(gegner: Gegner) {
        println("Aktion: Dark Hund Transit ")
        if (gegner.hp >= 40 && (this.hp < 10)) {
            gegner.hp -= 35 * 2
            println("Gebissen!!!")
        }
        for (gegnerAll in GEGNER1) {
            gegnerAll.hp -= 45
            println(
                "Held ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
            )
        }
    }

    override fun waffeAttacke(gegner: Gegner) {
        println("Aktion: waffeAttacke ")
        val schaden = Random.nextInt(45..65)
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit der $waffe an," +
                    " fügt Schaden zu und reduziert die" +
                    " HP der Gegner.\n${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )

    }

    fun wolfAttacke(gegner: Gegner) {
        println("Aktion: wolfAttacke ")
        val schaden = Random.nextInt(schaden.first, schaden.last + 1)
        gegner.hp -= schaden
        println(
            "${this.name} verwandelt sich in 1 Wolfe, greift ${gegner.name} an: " +
                    "\n${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )
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
        return beutelAktion(Beutel())
    }


}


