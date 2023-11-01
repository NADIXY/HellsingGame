package HellsingGame

import HellsingGame.Aktionen.Heilung
import HellsingGame.Character.Gegner.Gegner

class AlexandersHelfer(name: String, hp: Int, waffe: String, elementartyp: String, schaden: IntRange): Gegner(name,hp,waffe,elementartyp,schaden){

    override fun leistung(aktionIndex: Int, ziel: Gegner) {}

    override fun zaubertrank(heilung: Heilung, beschreibung: String, trinken: Gegner) {

    }

    override fun attacken() {

    }
}