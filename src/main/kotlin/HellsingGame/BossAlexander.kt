package HellsingGame

import kotlin.random.Random
import kotlin.random.nextInt


class BossAlexanderA(name: String, hp: Int, waffe: String, elementartyp: String, schaden: IntRange) :
    Gegner(name, hp, waffe, elementartyp, schaden) {

    override fun aktionAusfuehren(helden: Helden) {
        println("Jetzt ist ${this.name} am Start mit ${this.hp}HP!")
        val aktion = (1..6).random()
        when (aktion) {
            1 -> waffeAngriff(helden)
            2 -> flaechenschaden(helden1)
            3 -> fluch(helden)
            4 -> helferBeschworen()
            5 -> attacke5()
            6 -> attacke6()
            else -> println("Eingabe Falsch!.")
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
                    "$name hat die Helden ${held.name} mit Feuer verbrannt," +
                            " \n die Helden ${held.name} haben jetzt nur noch ${held.hp}HP übrig!"
                )
            }

        }

        override fun fluch(held: Helden) {
            println("Gegner $name verflucht den Helden ${held.name}.")

            val hpx = hp * 0.2
            for (i in 1..10) {
                if (held.hp > hpx) {
                    held.hp -= (held.hp * 0.1).toInt()
                    println("Verflucht")
                } else {
                    println("Nicht Verflucht")
                    break
                }
            }

        }
    }

    fun helferBeschworen() {
        println("Ein Unterboss wurde beschworen")
    }
    fun attacke5() {}
    fun attacke6() {}

