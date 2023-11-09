package HellsingGame

class Beutel {

    private var heitrankAusgenutzt = false
    private var vitamineAusgenutzt = false

    var inventar: MutableList<String> = mutableListOf("Heiltrank", "Vitamine")

    fun heiltrank(held: Helden){
        if (!heitrankAusgenutzt) {
            val heiltrank = "Heiltrank"
            val heilung = held.hp / 2
            held.hp += heilung
            println(
                "${held.name} hat sich mit dem $heiltrank um $heilung geheilt.\n" +
                        " Jetzt beträgt der HP ${held.hp}HP!"
            )
            heitrankAusgenutzt = true
        } else {
            println("Der Heiltrank wurde bereits in dieser Kampfrunde verwendet.")
        }
    }


    fun vitamine(held: Helden) {
        if (!vitamineAusgenutzt) {
            val aufpusch = "Vitamine"
            held.schaden = (held.schaden.first * 1.1).toInt()..(held.schaden.last * 1.1).toInt()
            println(
                "${held.name} hat einen Schadensbonus von 10% erhalten mit dem $aufpusch," +
                        "" + "\n jetzt beträgt das Gutgeschriebene 'schaden'  ${held.schaden}schaden!"
            )
            vitamineAusgenutzt = true
        } else {
            println("Die Vitamine wurden bereits in dieser Kampfrunde verwendet.")
        }
    }
}











