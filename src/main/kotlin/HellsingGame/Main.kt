package HellsingGame

import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl

var helden: List<Helden> =
    listOf(
        Alucard("Alucard",100,"Schwert","Feuer",10..20),
        Integra("Integra",120,"Pistole","Eis",15..25),
        SerasVictoria("Seras Victoria",80,"Gewehr","Blitz",8..15),
        WalterC("Walter C,",90,"Dolch","Gift",12..18)
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

    val teams = Teams(helden)
    val endgegner = BossAlexanderA("Alexander Anderson",200,"Heiliges Schwert", "Licht",20..30)

    teams.kampfStart(endgegner)




}














