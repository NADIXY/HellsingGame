package HellsingGame

class Game {

    fun kampfStart(gegner: List<Gegner>) {

        var level = 1
        while (true) {
            println("Round $level:")
            println("Team_Helden 'HELLSING' startet:")
            for (held in helden) {
                if (held.hp > 0) {
                    println("${held.name} ist am Start mit ${held.hp}HP")
                    held.aktionAusfuehren()
                    println()
                }
            }
             gegner.random().aktionAusfuehren(helden.random())
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
        println("Das Team 'HELLSING' ist K.O geschlagen worden! Der Endgegner ${gegner.random().name} hat gewonnen!")
    }
    private fun teamTot(): Boolean {
        for (held in helden) {
            if (held.hp >= 0) {
                return false
            }
        }
        return true
    }

}

