package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class BossHelfer(name: String, hp: Int, waffe: String, element: String, schaden: IntRange):
    Gegner(name,hp,waffe,element,schaden){

    override fun aktionAusfuehren(helden: Helden) {
        println("Jetzt ist ${this.name} am Start mit ${this.hp}HP!")

         val aktion = (1..4).random()
        when (aktion){
            1 -> attacke1(helden)
            2 -> waffeAngriff(helden)
            3 -> yyy(helden)
            4 -> yyyy(helden)
            else -> println("Ungültige Auswahl.")
        }
    }


   fun attacke1(held: Helden) {}

    override fun waffeAngriff(helden: Helden) {
        println("Unterboss: ${this.name} attackiert mit 1 Waffe!")
        println()
        val schaden = Random.nextInt(15..35)
        helden.hp -= schaden
        println("${this.name} greift ${helden.name} mit der ${this.waffe} an," +
                    " fügt Schaden zu und reduziert die" +
                    " HP.\njetzt hat Held ${helden.name} nur noch ${helden.hp}HP übrig!")
    }

    fun yyy(helden: Helden ) {
        println("Gegner $name schadet Helden_Team 'HELLSING'.")
    }

    fun yyyy(helden: Helden) {
        println("Gegner schadet Held ${helden.name}.")
    }

}