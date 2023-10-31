package HellsingGame

class AlexandersHelfer(name: String, hp: Int): Character(name,hp) {
    var aktionen = mutableListOf<Aktion>()
    fun leistung(aktionIndex: Int, ziel: Character) {}
}