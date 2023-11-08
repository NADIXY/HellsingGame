package HellsingGame

open class Gegner(val name: String, var hp: Int, val waffe: String, val element: String, val schaden: IntRange) {

    open fun attacke1() {
        println("Gegner $name führt eine Attacke aus.")
    }

    open fun flaechenschaden(helden: List<Helden>) {
        println("Gegner $name fügt dem Helden_Team 'HELLSING' Flächenschaden zu.")
    }

    open fun fluch(held: Helden) {
        println("Gegner $name verflucht den Held ${held.name}.")
    }

    open fun waffeAngriff(helden: Helden) {
        println("Ein Held wird mit 1 Waffe attackiert!")
    }

    open fun aktionAusfuehren(helden: Helden) {
        val aktion = (1..6).random()
        when (aktion) {
            1 -> attacke1()
            2 -> flaechenschaden(HELDEN1)
            3 -> fluch(helden)
            4 -> waffeAngriff(helden)
            else -> println("Eingabe Falsch!")
        }
    }

}


