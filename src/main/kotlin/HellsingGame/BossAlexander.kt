package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt


class BossAlexanderA(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Gegner(name, hp, waffe, element, schaden) {

    override fun aktionAusfuehren(helden: Helden) {
        println("Jetzt ist ${this.name} am Start mit ${this.hp}HP!")
        val aktion = (1..6).random()
        when (aktion) {
            1 -> waffeAngriff(helden)
            2 -> flaechenschaden(HELDEN1)
            3 -> fluch(helden)
            4 -> helferBeschworen()
            5 -> attacke5()
            6 -> attacke6()
            else -> println("Eingabe Falsch!")
        }
    }

    override fun waffeAngriff(helden: Helden) {
        println("Boss ${this.name} attackiert mit 1 Waffe!")
        println()
        val schaden = Random.nextInt(20..45)
        helden.hp -= schaden
        println(
            "$name greift ${helden.name} mit der $waffe an," +
                    " fügt Schaden zu und reduziert die" +
                    " HP.\njetzt hat Held ${helden.name} nur noch ${helden.hp}HP übrig!"
        )
    }

    override fun flaechenschaden(helden: List<Helden>) {
        println("Gegner $name fügt dem Helden_Team 'HELLSING' Flächenschaden mit Feuer zu.")
        for (held in helden) {
            val schaden = Random.nextInt(10..30)
            held.hp -= schaden
            println(
                "$name hat  Held ${held.name} mit Feuer verbrannt," +
                        " \nHeld ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
            )
        }
    }

    override fun fluch(held: Helden) {
        println("Gegner $name verflucht den Helden ${held.name}.")

        val hpx = hp * 0.2
        for (i in 1..10) {
            if (held.hp > hpx) {
                held.hp -= (held.hp * 0.1).toInt()
                println(
                    "Verflucht...\n" +
                            "Held ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
                )
            } else {
                println(
                    "'Fluch' zu schwach!\n" +
                            "Held ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
                )
                break
            }
        }
    }

    fun helferBeschworen(): BossHelfer {
        val unterBoss = BossHelfer("Boss Helfer", 130, "Pistole", "Licht", 70..150)
        if (this.hp > 100) {
            val listeGegner1 = GEGNER1.toMutableList()
            listeGegner1.add(unterBoss)
            println("Beschworen des Unterbosses! Unterboss ist aufgerufen worden")
        }
        return unterBoss
    }

    fun attacke5() {}
    fun attacke6() {}


}




