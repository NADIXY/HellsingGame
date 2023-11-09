package HellsingGame
import HellsingGame.Gegner.Gegner

open class Helden(
    val name: String, var hp: Int, val waffe: String, val element: String, var schaden: IntRange
) {

    open fun aktionAusfuehren() {
        println(
            """
            Aktion bitte auswählen:
            1 -> Aktionen
            2 -> Beutelaktion
            
        """.trimIndent()
        )
        val auswahl = readln().toIntOrNull()
        when (auswahl) {
            1 -> aktionen(GEGNER1.random())
            2 -> beutelAktion(beutel = Beutel())
            else -> println("Eingabe Falsch!")
        }
    }

    open fun heilZauber() {
        println("Held heilt sich mit dem Heil Zauber.")
    }

    open fun aktionen(gegner: Gegner) {
        println("1 Aktion wird ausgesucht und ausgeführt")
    }

    open fun waffeAttacke(gegner: Gegner) {
        println("Ein Gegner wird mit 1 Waffe attackiert!")
    }

    private var heitrankAusgenutzt = false
    private var vitamineAusgenutzt = false

    open fun beutelAktion(beutel: Beutel) {
        if (heitrankAusgenutzt && vitamineAusgenutzt ) {
            throw  Exception("Die Funktion wurde bereits aufgerufen!")
        }
        println("Held wird sich heilen...")
        heitrankAusgenutzt = true
        vitamineAusgenutzt = true
        return beutelAktion(Beutel())
    }


}