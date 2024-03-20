
//    @author Gabriel Viegas Dantas
//    @version 1.0
//    @since Release 1.0 da aplicação

package org.example;

public class Calculadora {

    // @param n1, primeiro número inteiro da soma
    // @param n2, segundo número inteiro da soma
    // @return , resultado de n1 mais n2
    public double somaDoisNumerosInteiros(int n1, int n2) {
        return n1 + n2;
    }

    // @param n1, primeiro número inteiro da subtração
    // @param n2, segundo número inteiro da subtração
    // @return , resultado de n1 menos n2
    public double subtraiDoisNumerosInteiros(int n1, int n2) {
        return n1 - n2;
    }

    // @param n1, primeiro número inteiro da multiplicação
    // @param n2, segundo número inteiro da multiplicação
    // @return , resultado de n1 vezes n2
    public double multiplicaDoisNumerosInteiros(int n1, int n2) {
        return n1 * n2;
    }

    // @param n1, primeiro número inteiro da divisão
    // @param n2, segundo número inteiro da divisão
    // @return , resultado de n1 divido por n2
    public double divideDoisNumerosInteiros(int n1, int n2) {
        return (double) n1 / n2;
    }

}
