package HellsingGame

class Beutel {

    private var inventar : MutableMap<String,Int> = mutableMapOf(
        "portionenHeiltrank" to 50,
        "vitamine" to 1.1.toInt()
        )

    fun heiltrank(held: Helden) {
        println("Heilt um die Hälfte seiner Lebenspunkte")

        val portionenHeiltrank = held.hp / 2
        if (portionenHeiltrank == 50) {
        inventar[portionenHeiltrank.toString()]= 50
        held.hp += portionenHeiltrank
            inventar.remove("portionenHeiltrank")
            println("${held.name} wurde um $portionenHeiltrank mit der Heiltrank geheilt.")

            //println("Heiltrank nicht mehr verfügbar!")
        }
    }

    fun vitamine(held: Helden) {
        held.schaden = (held.schaden.first * 1.1).toInt()..(held.schaden.last * 1.1).toInt()
        println("${held.name} hat einen Schadensbonus von 10% erhalten")
        //println("Vitamine Spritze ist jetzt nicht mehr verfügbar!")
    }


    }


