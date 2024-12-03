import java.util.Scanner

class Person {
    private var name: String = ""
    fun setName(newName: String) {
        name = newName
    }
    fun printName() {
        println(name)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    scanner.nextLine()
    for (i in 1..n) {
        val person = Person()
        val name = scanner.nextLine()
        person.setName(name)
        person.printName()
    }
}

