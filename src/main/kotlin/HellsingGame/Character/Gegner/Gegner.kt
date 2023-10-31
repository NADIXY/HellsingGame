package HellsingGame.Character.Gegner

import HellsingGame.Aktionen.Aktion
import HellsingGame.Character.Character

open class Gegner(name: String, hp: Int, var waffe: String, val elementartyp: String): Character(name,hp) {

    var aktionen = mutableListOf<Aktion>()

    fun auswahlAktion() {}

    fun leistung(aktionIndex: Int, ziel: Character) {}




}