package com.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    // Método auxiliar com a lógica da calculadora
    private double calcular(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero!");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operação inválida!");
        }
    }

    @Test
    public void testSoma() {
        // Teste 1: Verifica soma
        assertEquals(8.0, calcular(5, 3, '+'), 0.001);
    }
    
    @Test
    public void testSubtracao() {
        // Teste 2: Verifica subtração
        assertEquals(6.0, calcular(10, 4, '-'), 0.001);
    }
    
    @Test
    public void testMultiplicacao() {
        // Teste 3: Verifica multiplicação
        assertEquals(42.0, calcular(7, 6, '*'), 0.001);
    }
    
    @Test
    public void testDivisao() {
        // Teste 4: Verifica divisão
        assertEquals(5.0, calcular(15, 3, '/'), 0.001);
    }
    
    @Test
    public void testDivisaoPorZero() {
        // Teste 5: Verifica divisão por zero
        assertThrows(ArithmeticException.class, () -> {
            calcular(10, 0, '/');
        });
    }
}
