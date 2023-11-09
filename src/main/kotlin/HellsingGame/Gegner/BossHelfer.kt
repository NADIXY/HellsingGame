package HellsingGame.Gegner


import HellsingGame.HELDEN1
import HellsingGame.Helden
import kotlin.random.Random
import kotlin.random.nextInt

class BossHelfer(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Gegner(name, hp, waffe, element, schaden) {

    override fun aktionAusfuehren(helden: Helden) {
        println("Jetzt ist ${this.name} am Start mit ${this.hp}HP!")

        val aktion = (1..4).random()
        when (aktion) {
            1 -> hpErhöhen()
            2 -> waffeAngriff(helden)
            3 -> fluchSymbol(helden)
            4 -> elektrischeVolken(HELDEN1)
            else -> println("Eingabe Falsch!")
        }
    }

    fun hpErhöhen() {
        println("Aktion: hpErhöhen ")
            hp += 70
            println(
                "${this.name} hat '70HP +' dazu bekommen, sich mit HP aufgepumpt." + "\n${this.name}'s HP beträgt jetzt ${this.hp}HP."
            )
        }

    override fun waffeAngriff(helden: Helden) {
        println("Aktion: waffeAngriff ")
        println("Unterboss: ${this.name} attackiert mit 1 Waffe!")
        println()
        val schaden = Random.nextInt(15..35)
        helden.hp -= schaden
        println(
            "${this.name} greift ${helden.name} mit der ${this.waffe} an," + " fügt Schaden zu und reduziert die" + " HP.\njetzt hat Held" + " ${helden.name} nur noch ${helden.hp}HP übrig!"
        )
    }

    fun fluchSymbol(helden: Helden) {
        println("Aktion: fluchSymbol ")
        if (HELDEN1.size == 4 && helden.hp < 35) helden.hp -= 0.2.toInt() * 0.2.toInt() * 0.2.toInt() * 0.2.toInt()
        println(
            "Gegner ${this.name} zeigt 1 Fluch Symbol an Held ${helden.name} und wird geschädigt,\n" + " jetzt sind nur noch ${helden.hp}HP übrig ."
        )
    }

    fun elektrischeVolken(helden: List<Helden>) {
        println("Aktion des Unterbosses elektrischeVolken ")
        for (held in helden) {
            val schaden = Random.nextInt(10..30) * Random.nextInt(10..30) * Random.nextInt(10..30)
            held.hp -= schaden
            println(
                "Elektrischen Wolken schädigen die Helden!" + " ${this.name} hat  Held ${held.name}" + "\n und Tem Hellsing sind elektriziert." + "\nHeld ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
            )
        }
    }
}