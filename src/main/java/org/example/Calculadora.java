package org.example;

/**
 * @author Gabriel Viegas Dantas
 * @version 1.1
 * @since Release 1.1 da aplicação
 */

public class Calculadora {

    /**
     *
     * @param n1, primeiro número inteiro que será usado na soma
     * @param n2, segundo número inteiro que será usado na soma
     * @return , o resultado de n1 mais n2
     */
    public double somaDoisNumerosInteiros(int n1, int n2) {
        return n1 + n2;
    }

    /**
     *
     * @param n1, primeiro número inteiro que será usado na subtração
     * @param n2, segundo número inteiro que será usado na subtração
     * @return , o resultado de n1 menos n2
     */
    public double subtraiDoisNumerosInteiros(int n1, int n2) {
        return n1 - n2;
    }

    /**
     *
     * @param n1, primeiro número inteiro que será usado na multiplicação
     * @param n2, segundo número inteiro que será usado na multiplicação
     * @return , o resultado de n1 multiplicado por n2
     */
    public double multiplicaDoisNumerosInteiros(int n1, int n2) {
        return n1 * n2;
    }

    /**
     *
     * @param n1, primeiro número inteiro que será usado na divisão
     * @param n2, segundo número inteiro que será usado na divisão
     * @return , o resultado de n1 dividido por n2
     */
    public double divideDoisNumerosInteiros(int n1, int n2) {
        return (double) n1 / n2;
    }
}
