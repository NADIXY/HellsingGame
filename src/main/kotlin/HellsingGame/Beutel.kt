package HellsingGame

class Beutel {



    var inventar: MutableList<String> = mutableListOf("Heiltrank", "Vitamine")

    fun heiltrank(held: Helden) {
        val heiltrank = "Heiltrank"
        val heilung = held.hp / 2
        held.hp += heilung
        println("${held.name} hat mit dem $heiltrank sich um $heilung geheilt.\n" +
                " Jetzt beträgt der HP ${held.hp}HP!")
    }


    fun vitamine(held: Helden) {
        val aufpusch = "Vitamine"
        held.schaden = (held.schaden.first * 1.1).toInt()..(held.schaden.last * 1.1).toInt()
        held.schaden + held.hp
        println(
            "${held.name} hat einen Schadensbonus von 10% erhalten mit dem $aufpusch erhalten," + "\n jetzt beträgt der HP ${held.hp}HP"
        )
    }
}










