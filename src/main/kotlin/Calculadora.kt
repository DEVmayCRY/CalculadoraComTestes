import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    fun soma(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    fun subt(num1: Int, num2: Int): Int {
        return num1 - num2
    }
    fun mult(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    fun divi(num1: Int, num2: Int): Int {
        return num1 / num2
    }
    fun raizQuadra(num1: Double): Double {
        return sqrt(num1)
    }
    fun pote(num1: Double, expoente: Int): Double {
        return num1.pow(expoente)
    }

}