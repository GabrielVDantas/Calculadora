package org.example;

/**
 * @author Gabriel Viegas Dantas
 * @version 1.1
 * @since Release 1.1 da aplicação
 */

public class Calculadora {

    /**
     *
     * @param n1 primeiro numero inteiro que sera usado na soma
     * @param n2 segundo numero inteiro que sera usado na soma
     * @return o resultado de n1 mais n2
     */
    public double somaDoisNumerosInteiros(int n1, int n2) {
        return n1 + n2;
    }

    /**
     *
     * @param n1 primeiro numero inteiro que sera usado na subtracao
     * @param n2 segundo numero inteiro que sera usado na subtracao
     * @return o resultado de n1 menos n2
     */
    public double subtraiDoisNumerosInteiros(int n1, int n2) {
        return n1 - n2;
    }

    /**
     *
     * @param n1 primeiro numero inteiro que sera usado na multiplicacao
     * @param n2 segundo numero inteiro que sera usado na multiplicacao
     * @return o resultado de n1 multiplicado por n2
     */
    public double multiplicaDoisNumerosInteiros(int n1, int n2) {
        return n1 * n2;
    }

    /**
     *
     * @param n1 primeiro numero inteiro que sera usado na divisao
     * @param n2 segundo numero inteiro que sera usado na divisao
     * @return o resultado de n1 dividido por n2
     */
    public double divideDoisNumerosInteiros(int n1, int n2) {
        return (double) n1 / n2;
    }
}
