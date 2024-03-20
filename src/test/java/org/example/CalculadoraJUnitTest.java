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

    /**
     * Cenário de teste 1: soma de dois numeros inteiros
     */
    @Test
    @DisplayName("O metodo recebe dois numeros inteiros e soma o segundo ao primeiro")
    void somaDoisNumerosInteiros() {
//        resultadoReal armazena o valor do método somaDoisNumerosInteiros
        double resultadoReal = calculadora.somaDoisNumerosInteiros(10, 5);
//        compara o resultado esperado com o resultado real armazenado na variável resultadoReal
        assertEquals(15, resultadoReal);
    }

    /**
     * Cenário de teste 2: subtracao de dois numeros inteiros
     */
    @Test
    @DisplayName("O metodo recebe dois numeros inteiros e subtrai o segundo do primeiro")
    void subtraiDoisNumerosInteiros() {
//        resultadoReal armazena o valor do método subtraiDoisNumerosInteiros
        double resultadoReal = calculadora.subtraiDoisNumerosInteiros(10, 5);
//        compara o resultado esperado com o resultado real armazenado na variável resultadoReal
        assertEquals(5, resultadoReal);
    }

    /**
     * Cenário de teste 3: multiplicacao de dois numeros inteiros
     */
    @Test
    @DisplayName("O metodo recebe dois numeros inteiros e multiplica o primeiro pelo segundo")
    void multiplicaDoisNumerosInteiros() {
//        resultadoReal armazena o valor do método multiplicaDoisNumerosInteiros
        double resultadoReal = calculadora.multiplicaDoisNumerosInteiros(10, 5);
//        compara o resultado esperado com o resultado real armazenado na variável resultadoReal
        assertEquals(50, resultadoReal);
    }

    /**
     * Cenário de teste 4: divisao de dois numeros inteiros
     */
    @Test
    @DisplayName("O metodo recebe dois numeros inteiros e divide o primeiro pelo segundo")
    void divideDoisNumerosInteiros() {
//        resultadoReal armazena o valor do método divideDoisNumerosInteiros
        double resultadoReal = calculadora.divideDoisNumerosInteiros(10, 5);
//        compara o resultado esperado com o resultado real armazenado na variável resultadoReal
        assertEquals(2, resultadoReal);
    }
}