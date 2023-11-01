package HellsingGame.Character.Helden

import HellsingGame.Aktionen.Heilung

open class Helden(val name: String, val hp: Int, val waffe: String, val elementartyp: String, val schaden: IntRange) {

    open fun attacken() {

    }
    fun aktionAusfuehren(aktionIndex: Int, ziel: Helden) {}

    open fun zaubertrank(heilung: Heilung, beschreibung: String, trinken: Helden) {

    }

}