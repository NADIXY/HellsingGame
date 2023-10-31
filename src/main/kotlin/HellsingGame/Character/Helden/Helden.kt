package HellsingGame.Character.Helden

import HellsingGame.Character.Character

open class Helden(name: String, hp: Int, var waffe: String, val elementartyp: String): Character(name,hp) {

    fun aktionAusfuehren(aktionIndex: Int, ziel: Character) {}

}