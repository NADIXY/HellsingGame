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
                }else{
                    println("Held ${held.name} ist K.O. und kann nicht mehr im Kampf spielen!")
                }
            }
            val zufaelligeGegner = gegner.random()
            if (zufaelligeGegner.hp > 0) {
                zufaelligeGegner.aktionAusfuehren(HELDEN1.random())
            }else{
                println("1 Gegner ist K.O und kann nicht mehr im Kampf spielen!")
            }
            println("Jetzt ist HELLSING am Start!")
            if (teamTot()) {
                gameOver(gegner)
                break
            } else if (gegner.any { it.hp <= 0 }) {
                println("Der Endgegner oder ein Helfer ist K.O geschlagen worden!")
                break
            }
            level++
        }
    }
    fun gameOver(gegner: List<Gegner>) {
        println("Das Team 'HELLSING' ist K.O geschlagen worden!\n" +
                " Der Endgegner $gegner und seine Helfer haben gewonnen!")
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

