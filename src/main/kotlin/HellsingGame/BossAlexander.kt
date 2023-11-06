package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt


class BossAlexanderA(name: String, hp: Int, waffe: String, elementartyp: String, schaden: IntRange):
    Gegner(name,hp,waffe,elementartyp,schaden) {

    override fun aktionAusfuehren(helden: Helden) {
        println(
            """
            Jetzt ist ${this.name} am Start mit ${this.hp}HP!
            
            Aktion bitte auswählen:
            1 -> Angriff
            2 -> Flächenschaden
            3 -> Fluch

        """.trimIndent()
        )
        val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> angriff(helden)
            2 -> flaechenschaden(helden)
            3 -> fluch(helden)
            else -> println("Ungültige Auswahl.")
        }
    }

    override fun angriff(helden: Helden) {
        println("Boss ${this.name} führt eine Attacke aus...")
        println()
        val schaden = Random.nextInt(30..50)
        helden.hp -= schaden
        println("$name greift ${helden.name} mit $waffe an," +
                " fügt Schaden zu und reduziert ${helden.name}'s HP um ${helden.hp}HP.")
    }

    override fun flaechenschaden(helden: Helden ) {
        println("Gegner $name fügt dem Helden_Team 'HELLSING' Flächenschaden zu.")
    }

    override fun fluch(held: Helden) {
        println("Gegner $name verflucht den Helden ${held.name}.")
    }

    fun helferBeschworen() {}


}