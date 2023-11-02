package HellsingGame

class Beutel {
    var items : MutableList<String> = mutableListOf()

    //fun intemAktion(itemIndex: Int, ziel: Helden) {}

    fun heiltrank(held: Helden) {
        val heilung = held.hp / 2
        held.hp += heilung
        println("${held.name} wurde um $heilung geheilt.")
    }

    fun vitamine(held: Helden) {
        held.schaden = (held.schaden.first * 1.1).toInt()..(held.schaden.last * 1.1).toInt()
        println("${held.name} hat einen Schadensbonus von 10% erhalten")
    }




}