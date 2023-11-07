package HellsingGame

class Game {



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
                }
            }
             gegner.random().aktionAusfuehren(HELDEN1.random())
            println("Jetzt ist HELLSING am Start!")
            if (teamTot()) {
                gameOver(gegner)
                break
            } else if (gegner.random().hp < 10) {
                println("Der Endgegner ist K.O geschlagen worden!")
                break
            }
            level++
        }
    }
    fun gameOver(gegner: List<Gegner>) {
        println("Das Team 'HELLSING' ist K.O geschlagen worden!\n" +
                " Der Endgegner $gegner und seinem Helfer haben gewonnen!")
    }
    private fun teamTot(): Boolean {
        for (held in HELDEN1) {
            if (held.hp >= 0) {
                return false
            }
        }
        return true
    }

}

