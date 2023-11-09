package HellsingGame



import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl

fun main() {

    val xx = "src/main/kotlin/HellsingGame/xx.wav"
    val yy = "src/main/kotlin/HellsingGame/yy.wav"
    val zz: String = "src/main/kotlin/HellsingGame/zz.wav"

    println("sound 1 wird abgespielt:")
    playSound(xx)
    Thread.sleep(3000)
    println("sound 2 wird abgespielt:")
    playSound(yy)
    Thread.sleep(3000)
    println("sound 3 wird abgespielt:")
    playSound(zz)

    Thread.sleep(3000)
}

fun playSound(audioPath: String) {

    val audio: File = File(audioPath)
    val audioInput: AudioInputStream = AudioSystem.getAudioInputStream(audio)
    val clip: Clip = AudioSystem.getClip()
    clip.open(audioInput)
    clip.start()

    val soundThread: Thread = Thread {
        while (clip.isRunning) {
            Thread.sleep(5000)
            println("Thread ${Thread.currentThread().name} läuft noch...")
        }
    }

}










