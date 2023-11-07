package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class WalterC(name: String, hp: Int, waffe: String, element: String, schaden: IntRange ): Helden(name,hp,waffe,element,schaden) {

    override fun heilZauber() {
        hp += 20
        println("${this.name} hat '20HP +' dazu bekommen, sich mit dem Schutz Zauber geschützt." +
                "\n${this.name}'s HP beträgt jetzt ${this.hp}HP.")
    }


    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
        println(
            """
            "A" -> xxx
            "B" -> waffeAttacke
            "C" -> attacke3
            
        """.trimIndent()
        )
        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> xxx(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> attacke3()
            else -> println("Eingabe Falsch!")
        }
    }

    fun xxx(gegner: Gegner) {}

    override fun waffeAttacke(gegner: Gegner) {
        val schaden = Random.nextInt(5..15)
        gegner.hp -= schaden
        println("$name greift ${gegner.name} mit der $waffe an," +
                    " fügt Schaden zu und reduziert die" +
                    " HP der Gegner. ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!")
    }
    fun attacke3() {}

}