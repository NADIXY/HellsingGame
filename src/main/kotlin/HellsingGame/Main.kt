package HellsingGame

val HELDEN1: List<Helden> = listOf(
    Alucard("Alucard", 620, "Calibra Waffe", "Feuer", 10..20),
    Integra("Integra", 500, "Pistole", "Eis", 15..25),
    SerasVictoria("Seras Victoria",500 , "Gewehr", "Feuer", 8..15),
    WalterC("Walter C,", 580, "Verfluchte Seiden", "Blitz", 12..18)
)

val GEGNER1: List<Gegner> = listOf(
    BossAlexander("Boss Alexander Anderson", 1500, "Heiliges Schwert", "Licht", 80..200),
    BossHelfer("Boss Helfer", 1000, "Pistole", "Licht", 60..150)

)

fun main() {
    Thread.sleep(1000)

    println(
        "\n\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" + "🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" + "🔥🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥    HELLSING GAME    🔥🔥" + "🔥🔥🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" + "🔥🔥🔥🔥🔥\n\t\t\t\t\t\t\t\t\t\t\t\t🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥🔥" + "🔥🔥🔥🔥🔥🔥\n\n"
    )
    Thread.sleep(2000)
    println("\t\t\t\t\t\t\t\t\t\t\t\t\t🔥☠️🔥 ENJOY YOUR TIME WITH US... 🔥☠️🔥")
    Thread.sleep(1000)


    val startGame = StartGame()
    startGame.kampfStart(GEGNER1)


}














