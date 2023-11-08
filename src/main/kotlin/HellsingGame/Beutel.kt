package HellsingGame

class Beutel {

    var heiltrankGenutzt = false

    var inventar : MutableList<String> = mutableListOf()

    fun heiltrank(held: Helden) {
        inventar.add("Heiltrank")
        println("Lebenspunkte wird um die hälfte erhöht.")
        val portionenHeiltrank = held.hp / 2
        if (inventar.contains("Heiltrank") && !heiltrankGenutzt) {
            println("${held.name} wurde mit der Heiltrank geheilt,\n" +
                    " HP erhöht sich um ${held.hp}HP.")
            inventar.remove("Heiltrank")
            heiltrankGenutzt = true
        }else if (!inventar.contains("Heiltrank")) {
            println("Im Inventar ist keinen Heiltrank mehr verfügbar!")
        }else{
            println("In diesem 'Level' habt Ihr mit dem Heiltrank bereits geheilt!")
        }
    }

    fun vitamine(held: Helden) {
        val hpPlus = 0.1
        if (inventar.contains("Vitamine") && !heiltrankGenutzt) {
            held.hp = (1 + hpPlus).toInt()
            println(" Held ${held.name} hat dauerhaft die HP ${held.hp * 100}% erhöht!\n " +
                    "HP beträgt jetzt ${held.hp}")
            inventar.remove("Vitamine")
            heiltrankGenutzt = true
        }else if (!inventar.contains("Vitamine")) {
            println("Im Inventar ist keine Vitamine mehr verfügbar!")
        }else{
            println("In diesem 'Level' habt Ihr bereits geheilt!")
        }

    }


}






