package HellsingGame

val HELDEN1: List<Helden> =
    listOf(
        Alucard("Alucard",100,"Calibra Waffe","Feuer",10..20),
        Integra("Integra",110,"Pistole","Eis",15..25),
        SerasVictoria("Seras Victoria",80,"Gewehr","Blitz",8..15),
        WalterC("Walter C,",90,"Dolch","Gift",12..18)
    )

val GEGNER1: List<Gegner> =
    listOf(
        BossAlexanderA("Boss Alexander Anderson",400,"Heiliges Schwert", "Licht",80..200),
        BossHelfer("Boss Helfer",350,"Pistole","Licht",70..150)
    )

fun main() {

    println(
        "\n\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" +
                "🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" +
                "🔥🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥    HELLSING GAME    🔥🔥" +
                "🔥🔥🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" +
                "🔥🔥🔥🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" +
                "🔥🔥🔥🔥🔥🔥\n\n"
    )

    Thread.sleep(1000)

    println("\t\t\t\t\t\t\t\t\t\t\t\t\t🔥☠️🔥 ENJOY YOUR TIME WITH US... 🔥☠️🔥")

    val game = Game()
    game.kampfStart(GEGNER1)

}














