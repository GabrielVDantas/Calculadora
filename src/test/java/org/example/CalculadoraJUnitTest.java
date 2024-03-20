package org.example;

/**
 * @author Gabriel Viegas Dantas
 * @version 1.1
 * @since Release 1.1 da aplicação
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraJUnitTest {

    Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("O método recebe dois números inteiros e soma o segundo ao primeiro")
    void somaDoisNumerosInteiros() {
//        comparação entre o valor esperado (nesse caso 15)
//        e o valor que será retornado pelo metodo somaDoisNumerosInteiros ao receber 10 e 5 como parâmetros
        assertEquals(15, calculadora.somaDoisNumerosInteiros(10, 5));
    }

    @Test
    @DisplayName("O método recebe dois números inteiros e subtrai o segundo do primeiro")
    void subtraiDoisNumerosInteiros() {
//        comparação entre o valor esperado (nesse caso 5)
//        e o valor que será retornado pelo metodo subtraiDoisNumerosInteiros ao receber 10 e 5 como parâmetros
        assertEquals(5, calculadora.subtraiDoisNumerosInteiros(10, 5));
    }

    @Test
    @DisplayName("O método recebe dois números inteiros e multiplica o primeiro pelo segundo")
    void multiplicaDoisNumerosInteiros() {
//        comparação entre o valor esperado (nesse caso 50)
//        e o valor que será retornado pelo metodo multiplicaDoisNumerosInteiros ao receber 10 e 5 como parâmetros
        assertEquals(50, calculadora.multiplicaDoisNumerosInteiros(10, 5));
    }

    @Test
    @DisplayName("O método recebe dois números inteiros e divide o primeiro pelo segundo")
    void divideDoisNumerosInteiros() {
//        comparação entre o valor esperado (nesse caso 2)
//        e o valor que será retornado pelo metodo divideDoisNumerosInteiros ao receber 10 e 5 como parâmetros
        assertEquals(2, calculadora.divideDoisNumerosInteiros(10, 5));
    }
}