package HellsingGame

class SerasVictoria(name: String, hp: Int, waffe: String, element: String, schaden: IntRange): Helden(name,hp,waffe,element,schaden) {


    override fun heilung() {
        hp += 40
        println("$name hat sich um 40 HP geheilt.")
    }

    override fun beutelAktion(beutel: Beutel) {
        val auswahl = readln().toIntOrNull()

        when(auswahl) {
            1 -> beutel.heiltrank(this)
            2 -> beutel.vitamine(this)
            else -> println("Ungültige Auswahl.")
        }
    }

    override fun attacken() {
        println("Held ${this.name} führt eine Attacke aus.")
    }


}