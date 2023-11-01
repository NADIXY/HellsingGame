package HellsingGame.Character.Gegner

import HellsingGame.Aktionen.Aktion
import HellsingGame.Aktionen.Heilung
import HellsingGame.Character.Helden.Helden

open class Gegner(val name: String, val hp: Int, val waffe: String, val elementartyp: String, val schaden: IntRange) {

    var aktionen = mutableListOf<Aktion>()

    fun auswahlAktion() {}

    open fun leistung(aktionIndex: Int, ziel: Gegner) {}

    open fun zaubertrank(heilung: Heilung, beschreibung: String, trinken: Gegner) {

    }

    open fun attacken() {

    }






}