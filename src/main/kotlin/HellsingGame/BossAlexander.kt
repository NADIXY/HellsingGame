package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt


class BossAlexanderA(name: String, hp: Int, waffe: String, elementartyp: String, schaden: IntRange):
    Gegner(name,hp,waffe,elementartyp,schaden) {

    override fun aktionAusfuehren(helden: Helden) {
        println("Jetzt ist ${this.name} am Start mit ${this.hp}HP!")
        //val auswahl = readln().toIntOrNull()
        //when (auswahl) {
            //1 -> angriff(helden)
            //2 -> flaechenschaden(helden)
            //3 -> fluch(helden)
            //else -> println("Ungültige Auswahl.")
        //}
    }

    override fun waffeAngriff(helden: Helden) {
        println("Boss ${this.name} attackiert mit 1 Waffe!")
        println()
        val schaden = Random.nextInt(20..45)
        helden.hp -= schaden
        println("$name greift ${helden.name} mit der $waffe an," +
                " fügt Schaden zu und reduziert die" +
                " HP.\njetzt hat Held ${helden.name} nur noch ${helden.hp}HP übrig!")
    }


    override fun flaechenschaden(helden: Helden ) {
        println("Gegner $name fügt dem Helden_Team 'HELLSING' Flächenschaden zu.")
    }

    override fun fluch(held: Helden) {
        println("Gegner $name verflucht den Helden ${held.name}.")
    }

    fun helferBeschworen() {}
    fun attacke5() {}
    fun attacke6() {}

}