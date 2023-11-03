package HellsingGame

class Alucard(name: String, hp: Int, waffe: String, element: String, schaden: IntRange): Helden(name,hp,waffe,element,schaden) {


    //override fun heilung() {
        //super.heilung()
    //}

    override fun heilung() {
       hp += 50
        println("$name hat sich um 50HP geheilt")
    }

    //override fun beutelAktion(beutel: Beutel) {
        //super.beutelAktion(beutel)
    //}
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


