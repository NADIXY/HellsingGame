package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt

class BossAlexander(name: String, hp: Int, waffe: String, element: String, schaden: IntRange) :
    Gegner(name, hp, waffe, element, schaden) {

    override fun aktionAusfuehren(helden: Helden) {
        println("Jetzt ist ${this.name} am Start mit ${this.hp}HP!")
        val aktion = (1..6).random()
        when (aktion) {
            1 -> waffeAngriff(helden)
            2 -> flaechenschaden(HELDEN1)
            3 -> fluch(helden)
            4 -> helferBeschworen()
            5 -> blindMacher(helden)
            6 -> heilBlatterWurf(HELDEN1)
            else -> println("Eingabe Falsch!")
        }
    }

    fun blindMacher(helden: Helden) {
        println("Aktion: blindMacher ")
        if (helden.hp > 80) {
            helden.hp -= schaden.last
            println(
                "blindMacher Nebel, schädeigen die Augen der Held ${helden.name}" +
                        "\n und machen um ${helden.hp}HP schwächer."
            )
        } else {
            println("Nächstes mal wirst du richtig getroffen!")

        }
    }

    override fun waffeAngriff(helden: Helden) {
        println("Aktion: waffeAngriff ")
        println("Boss ${this.name} attackiert mit 1 Waffe!")
        println()
        val schaden = Random.nextInt(20..45)
        helden.hp -= schaden
        println(
            "$name greift ${helden.name} mit der $waffe an," +
                    "\n fügt Schaden zu und reduziert die HP." +
                    "\njetzt hat Held ${helden.name} nur noch ${helden.hp}HP übrig!"
        )
    }

    override fun flaechenschaden(helden: List<Helden>) {
        println("Aktion: flaechenschaden ")
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
        println("Aktion: fluch ")
        println("Gegner $name verflucht den Helden ${held.name}.")

        val hpx = hp * 0.2
        for (i in 1..10) {
            if (held.hp > hpx) {
                held.hp -= (held.hp * 0.1).toInt()
                println(
                    "Verflucht...\n" + "Held ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
                )
            } else {
                println(
                    "'Fluch' zu schwach!\n" + "Held ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
                )
                break
            }
        }
    }

    fun helferBeschworen(): BossHelfer {
        println("Aktion: helferBeschworen ")

        val listeGegner1 = GEGNER1.toMutableList()
        val unterBoss = BossHelfer(
            "Boss Helfer", 130, "Pistole", "Licht", 70..150
        )
        val aktuellListe = listeGegner1.add(unterBoss)
        println("Beschworen des Unterbosses! Unterboss ist aufgerufen worden???")
        println(aktuellListe)
        return unterBoss
    }


    fun heilBlatterWurf(helden: List<Helden>) {
        println("Aktion: heilBlatterWurf ")
        for (held in helden) {
            val schaden = 2 / ((15 * 2) + (15 * 2))
            held.hp -= schaden
            println(
                "${this.name} hat Held ${held.name} mit Heil Blatter getroffen und die HP reduziert," +
                        "\nHeld ${held.name} hat jetzt nur noch ${held.hp}HP übrig!"
            )
        }
    }
}





