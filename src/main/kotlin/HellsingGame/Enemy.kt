package HellsingGame

class Enemy(name: String, hp: Int): Character(name,hp) {
    var aktionen = mutableListOf<Aktion>()

    fun auswahlAktion() {}

    fun leistung(aktionIndex: Int, ziel: Character) {}

}