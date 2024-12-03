interface Playable {
    fun play()
}

class Guitar : Playable {
    override fun play() {
        println("Играет гитара")
    }
}

fun main() {
    println("Введите команду:")
    val command = readLine()

    if (command == "play") {
        val guitar = Guitar()
        guitar.play()
    } else {
        println("Неизвестная команда.")
    }
}