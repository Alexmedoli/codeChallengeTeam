package DesafioAtual;
import static org.junit.Assert.*;
import org.junit.Test;

public class DesafioFizzBuzzTest {
    @Test
    public void testJogarFizzBuzz5() {
        // Teste 1: Verifica se o método retorna a saída correta para o número 5
        String resultado = DesafioFizzBuzz.jogarFizzBuzz(5);
        String esperado = "1\n2\nFizz\n4\nBuzz";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testJogarFizzBuzzZero() {
        // Teste 2: Verifica se o método lida com o número 0
        String resultado = DesafioFizzBuzz.jogarFizzBuzz(0);
        String esperado = "";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testJogarFizzBuzzNegativo() {
        // Teste 3: Verifica se o método lida com números negativos
        String resultado = DesafioFizzBuzz.jogarFizzBuzz(-10);
        String esperado = "";
        assertEquals(esperado, resultado);
    }
}
