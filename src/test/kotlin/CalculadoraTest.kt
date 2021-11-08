import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {
    val calculadora = Calculadora()

    @Test
    fun soma(){
        assertEquals(10, calculadora.soma(5,5))
    }
    @Test
    fun subt(){
        assertEquals(0, calculadora.subt(5,5))
    }
    @Test
    fun mult(){
        assertEquals(100, calculadora.mult(50,2))
    }
    @Test
    fun divi(){
        assertEquals(50, calculadora.divi(100,2))
    }
    @Test
    fun raiz(){
        assertEquals(9.0, calculadora.raizQuadra(81.0))
    }
    @Test
    fun pote(){
        assertEquals(100000.0, calculadora.pote(10.0,5))
    }
    @Test
    fun poteByMyself(){
        assertEquals(100000.0, calculadora.poteByMyself(10.0,5))
    }
}

