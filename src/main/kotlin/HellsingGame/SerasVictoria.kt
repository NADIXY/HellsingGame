package HellsingGame


import HellsingGame.Gegner.Gegner
import kotlin.random.Random
import kotlin.random.nextInt

class SerasVictoria(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    override fun heilZauber() {
        println("Aktion: heilZauber ")
        hp += 40
        println(
            "${this.name} hat '40HP +' dazu bekommen, sich mit dem Schutz Zauber geschützt." + "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
        )
    }

    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
        println(
            """
            "A" -> herzExplosion
            "B" -> waffeAttacke
            "C" -> weekDaysFluch
            "D" -> Heil Zauber
            
        """.trimIndent()
        )
        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> herzExplosion(GEGNER1)
            "B" -> waffeAttacke(gegner)
            "C" -> weekDaysFluch(gegner)
            "D" -> heilZauber()
            else -> println("Eingabe Falsch!")
        }
    }

    fun herzExplosion(gegner1: List<Gegner>) {
        println("Aktion: herzExplosion ")
        for (gegner in GEGNER1) {
            val schaden = 2 * 70
            gegner.hp -= schaden
            println(
                "${this.name} hat Held ${gegner.name} 1 Teil des Herzens Explodiert und die HP reduziert, " +
                        "\nHeld ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
            )
        }

    }

    override fun waffeAttacke(gegner: Gegner) {
        println("Aktion: waffeAttacke ")
        val schaden = Random.nextInt(25..35)
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit der $waffe an, " +
                    "fügt Schaden zu und reduziert die HP der Gegner.\n " +
                    "${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!"
        )
    }

    fun weekDaysFluch(gegner: Gegner) {
        println("Aktion: weekDaysFluch ")
        val schaden = Random.nextInt(schaden.first, schaden.last * 7)
        gegner.hp -= schaden
        println(
            "${this.name} verflucht mit der Fluch 'weekDaysFluch', " +
                    "einmal ${gegner.name} verflucht, \n für 1 Woche, jeden Tag kriegt 1 Kollaps " +
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