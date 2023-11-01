package HellsingGame.Character.Helden

import HellsingGame.Aktionen.Heilung

class WalterC(name: String, hp: Int, waffe: String, elementartyp: String, schaden: IntRange ): Helden(name,hp,waffe,elementartyp,schaden) {

    override fun attacken() {

    }


    override fun zaubertrank(heilung: Heilung, beschreibung: String, trinken: Helden) {

    }
}