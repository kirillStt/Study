import java.util.Scanner

class MathOperations {
    fun add(a: Int, b: Int): Double {
        return (a + b).toDouble()
    }

    fun subtract(a: Int, b: Int): Double {
        return (a - b).toDouble()
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Int, b: Int): Double {
        return (a * b).toDouble()
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Int, b: Int): Double {
        if (b == 0) throw IllegalArgumentException("Деление на ноль невозможно.")
        return (a.toDouble() / b)
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) throw IllegalArgumentException("Деление на ноль невозмонжно.")
        return a / b
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val mathOperations = MathOperations()

    println("Введите тип данных (Int или Double):")
    val dataType = scanner.nextLine()

    println("Введите тип операции (add, subtract, multiply, divide):")
    val operation = scanner.nextLine()

    println("Введите первое число:")
    val firstNumber = scanner.nextLine()

    println("Введите второе число:")
    val secondNumber = scanner.nextLine()

    try {
        val result = when (dataType) {
            "Int" -> {
                val a = firstNumber.toInt()
                val b = secondNumber.toInt()
                when (operation) {
                    "add" -> mathOperations.add(a, b)
                    "subtract" -> mathOperations.subtract(a, b)
                    "multiply" -> mathOperations.multiply(a, b)
                    "divide" -> mathOperations.divide(a, b)
                    else -> throw IllegalArgumentException("Неверный тип операции.")
                }
            }

            "Double" -> {
                val a = firstNumber.toDouble()
                val b = secondNumber.toDouble()
                when (operation) {
                    "add" -> mathOperations.add(a, b)
                    "subtract" -> mathOperations.subtract(a, b)
                    "multiply" -> mathOperations.multiply(a, b)
                    "divide" -> mathOperations.divide(a, b)
                    else -> throw IllegalArgumentException("Неверный тип операции.")
                }
            }

            else -> throw IllegalArgumentException("Неверный тип данных.")
        }
        println("Результат: $result")
    } catch (e: Exception) {
        println("Ошибка: ${e.message}")
    }
}