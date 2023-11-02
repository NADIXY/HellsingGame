package HellsingGame



class WalterC(name: String, hp: Int, waffe: String, elementartyp: String, schaden: IntRange ): Helden(name,hp,waffe,elementartyp,schaden) {

    override fun heilung() {
        hp += 20
        println("$name hat sich um 20 HP geheilt.")
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

    //override fun zaubertrank(heilung: Heilung, beschreibung: String, trinken: Helden) {

    //}
}