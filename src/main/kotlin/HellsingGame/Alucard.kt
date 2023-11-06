package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class Alucard(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Helden(name, hp, waffe, element, schaden) {

    //override fun heilung() {
    //super.heilung()
    //}

    override fun heilZauber() {
        hp += 50
        println(
            "${this.name} hat sich um 50 HP mit dem Schutz Zauber geschützt." +
                    "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
        )
    }


    override fun aktionen(gegner: Gegner) {
        println("Held ${this.name} führt eine Attacke aus.")
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
            "C" -> attacke3()
            else -> println("Eingabe nicht korrekt.")
        }
    }


    override fun queqsilberWolke(gegner: Gegner) {
        val attacke = "Queqsilber Wolke"
        val schaden = 25
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit dem Attacke: $attacke an," +
                    " fügt ${gegner.schaden} Schaden zu und reduziert die HP um ${gegner.hp}HP"
        )
    }


    override fun waffeAttacke(gegner: Gegner) {
        val schaden = Random.nextInt(5..20)
        gegner.hp -= schaden
        println(
            "$name greift ${gegner.name} mit der $waffe an," +
                    " fügt Schaden zu und reduziert die" +
                    " HP.\njetzt hat gegner ${gegner.name} nur noch ${gegner.hp}HP übrig!")
    }
    fun attacke3() {}

}


