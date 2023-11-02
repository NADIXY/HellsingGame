package HellsingGame

class HeldenTeam(val helden: List<Helden>) {
    
    val beutel: Beutel = Beutel()

    fun kampfStart(gegner:Gegner) {

        var round = 1
        while (true) {
            println("Round $round:")
            println("")
            for(held in helden) {
                if (held.hp > 0) {
                    println("${held.name} ist am Start")
                    held.aktionAusfuehren(gegner)
                    println("")
                }
            }
            gegner.auswahlAktion()
            println("")
            if (teamTot()) {
                gameOver(gegner)
                break
            }else if (gegner.hp <= 0) {
                println("Der Endgegner wurde besiegt!")
                break
            }
            round++
        }
    }

    fun gameOver(gegner: Gegner) {
        println("Das Team wurde besiegt. Der Endgegner ${gegner.name} hat gewonnen.")
    }

    private fun teamTot(): Boolean {
        for (held in helden) {
            if (held.hp > 0) {
                return false
            }
        }
        return true
    }
}