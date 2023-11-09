package HellsingGame



import HellsingGame.Gegner.BossAlexander
import HellsingGame.Gegner.Gegner

class StartGame {

    val bossAlexander = BossAlexander(
        "Boss Alexander Anderson", 5000, "Heiliges Schwert",
        "Licht", 80..200
    )

    val beutel = Beutel()

    private var helferBeschworen1 = false
    private var heitrankAusgenutzt = false
    private var vitamineAusgenutzt = false


    fun kampfStart(gegner: List<Gegner>) {

        var level = 1
        while (true) {
            println("Level $level:")
            println("Team_Helden 'HELLSING' startet:")
            for (held in HELDEN1) {
                if (held.hp > 0) {
                    println("Held Namen's ${held.name} ist am Start mit ${held.hp}HP")
                    held.aktionAusfuehren()
                    println()
                } else {
                    println("Held ${held.name} wurde bereits K.O. geschlagen!")
                }
            }
            val zufaelligeGegner = gegner.random()
            if (zufaelligeGegner.hp > 0) {
                zufaelligeGegner.aktionAusfuehren(HELDEN1.random())
            } else {
                println("1 Gegner ist K.O und kann nicht mehr im Kampfen spielen!")
            }
            println("Jetzt ist HELLSING am Start!")
            if (teamTot()) {
                gameOver(gegner)
                break
            } else if (gegner.any { it.hp <= 0 }) {
                println("Der Endgegner oder ein Helfer ist K.O geschlagen worden!")

                try {
                    bossAlexander.helferBeschworen()
                } catch (e: Exception) {
                    println(e.message)
                }
                try {
                    beutel.heiltrank(Helden("",0,"","",0..0))
                } catch (e: Exception) {
                    println(e.message)
                }
                try {
                    beutel.vitamine(Helden("",0,"","",0..0))
                } catch (e: Exception) {
                    println(e.message)
                }
            }
            level++
        }
    }


    fun gameOver(gegner: List<Gegner>) {
        println(
            "Das Team 'HELLSING' ist K.O geschlagen worden!\n" +
                    "Der Endgegner  und seine Helfer haben gewonnen!"
        )
    }

    private fun teamTot(): Boolean {
        for (held in HELDEN1) {
            if (held.hp > 0) {
                return false
            }
        }
        return true
    }

}

