package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class Integra(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    override fun heilZauber() {
        hp += 30
        println(
            "${this.name} hat sich um 30 HP mit dem Schutz Zauber geschützt." +
                    "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
        )
    }


    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
        println(
            """
            "A" -> xxxxx
            "B" -> waffeAttacke
            "C" -> attacke3
            
        """.trimIndent()
        )

        val eingabe = readln().uppercase()
        when (eingabe) {
            "A" -> xxxxx(gegner)
            "B" -> waffeAttacke(gegner)
            "C" -> attacke3()
            else -> println("Eingabe Falsch!")
        }
    }

    fun xxxxx(gegner: Gegner) {}

override fun waffeAttacke(gegner: Gegner) {
    val schaden = Random.nextInt(40..50)
    gegner.hp -= schaden
    println("$name greift ${gegner.name} mit der $waffe an," +
            " fügt Schaden zu und reduziert die" +
            " HP der Gegner. ${gegner.name} hat jetzt nur noch ${gegner.hp}HP übrig!")
}

fun attacke3() {}

}