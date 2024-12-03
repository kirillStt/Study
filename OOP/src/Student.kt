import java.util.Scanner

class Student : Person() {
    var studentId: Int = 0

    fun printStudentDetails() {
        println("Name: ${printName()}, Student ID: $studentId")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    scanner.nextLine()

    for (i in 1..n) {
        val student = Student()
        val input = scanner.nextLine().split("")
        val name = input[0]
        val studentId = input[1].toInt()

        student.setName(name)
        student.studentId = studentId
        student.printStudentDetails()
    }
}