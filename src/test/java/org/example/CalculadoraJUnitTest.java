package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraJUnitTest {

    Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("O método recebe dois números inteiros e soma o segundo ao primeiro")
    void somaDoisNumerosInteiros() {
        assertEquals(15, calculadora.somaDoisNumerosInteiros(10, 5));
    }

    @Test
    @DisplayName("O método recebe dois números inteiros e subtrai o segundo do primeiro")
    void subtraiDoisNumerosInteiros() {
        assertEquals(5, calculadora.subtraiDoisNumerosInteiros(10, 5));
    }

    @Test
    @DisplayName("O método recebe dois números inteiros e multiplica o primeiro pelo segundo")
    void multiplicaDoisNumerosInteiros() {
        assertEquals(50, calculadora.multiplicaDoisNumerosInteiros(10, 5));
    }

    @Test
    @DisplayName("O método recebe dois números inteiros e divide o primeiro pelo segundo")
    void divideDoisNumerosInteiros() {
        assertEquals(2, calculadora.divideDoisNumerosInteiros(10, 5));
    }
}