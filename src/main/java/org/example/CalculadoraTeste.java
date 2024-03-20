
//    @author Gabriel Viegas Dantas
//    @version 1.0
//    @since Release 1.0 da aplicação

package org.example;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        double resultado;

        // SOMA
        // Teste cenário 1: Somando dois números inteiros sendo ambos positivos
        resultado = calc.somaDoisNumerosInteiros(4, 3);
        System.out.println(resultado);

        // Teste cenário 2: Somando dois números inteiros sendo o primeiro positivo e o segundo negativo
        resultado = calc.somaDoisNumerosInteiros(4, -3);
        System.out.println(resultado);

        // Teste cenário 3: Somando dois números inteiros sendo o primeiro negativo e o segundo positivo
        resultado = calc.somaDoisNumerosInteiros(-4, 3);
        System.out.println(resultado);

        // Teste cenário 4: Somando dois números inteiros sendo ambos negativos
        resultado = calc.somaDoisNumerosInteiros(-3, -4);
        System.out.println(resultado);

        // Teste cenário 5: Somando zeros
        resultado = calc.somaDoisNumerosInteiros(0, 0);
        System.out.println(resultado);

        // SUBTRAÇÃO
        // Teste cenário 1: Subtraindo dois números inteiros sendo ambos positivos
        resultado = calc.subtraiDoisNumerosInteiros(4, 3);
        System.out.println(resultado);

        // Teste cenário 2: Subtraindo dois números inteiros sendo o primeiro positivo e o segundo negativo
        resultado = calc.subtraiDoisNumerosInteiros(4, -3);
        System.out.println(resultado);

        // Teste cenário 3: Subtraindo dois números inteiros sendo o primeiro negativo e o segundo positivo
        resultado = calc.subtraiDoisNumerosInteiros(-4, 3);
        System.out.println(resultado);

        // Teste cenário 4: Subtraindo dois números inteiros sendo ambos negativos
        resultado = calc.subtraiDoisNumerosInteiros(-3, -4);
        System.out.println(resultado);

        // Teste cenário 5: Subtraindo zeros
        resultado = calc.subtraiDoisNumerosInteiros(0, 0);
        System.out.println(resultado);

        // MULTIPLICAÇÃO
        // Teste cenário 1: Multiplicando dois números inteiros sendo ambos positivos
        resultado = calc.multiplicaDoisNumerosInteiros(4, 3);
        System.out.println(resultado);

        // Teste cenário 2: Multiplicando dois números inteiros sendo o primeiro positivo e o segundo negativo
        resultado = calc.multiplicaDoisNumerosInteiros(4, -3);
        System.out.println(resultado);

        // Teste cenário 3: Multiplicando dois números inteiros sendo o primeiro negativo e o segundo positivo
        resultado = calc.multiplicaDoisNumerosInteiros(-4, 3);
        System.out.println(resultado);

        // Teste cenário 4: Multiplicando dois números inteiros sendo ambos negativos
        resultado = calc.multiplicaDoisNumerosInteiros(-3, -4);
        System.out.println(resultado);

        // Teste cenário 5: Multiplicando zeros
        resultado = calc.multiplicaDoisNumerosInteiros(0, 0);
        System.out.println(resultado);

        // DIVISÃO
        // Teste cenário 1: Dividindo dois números inteiros sendo ambos positivos
        resultado = calc.divideDoisNumerosInteiros(4, 3);
        System.out.println(resultado);

        // Teste cenário 2: Dividindo dois números inteiros sendo o primeiro positivo e o segundo negativo
        resultado = calc.divideDoisNumerosInteiros(4, -3);
        System.out.println(resultado);

        // Teste cenário 3: Dividindo dois números inteiros sendo o primeiro negativo e o segundo positivo
        resultado = calc.divideDoisNumerosInteiros(-4, 3);
        System.out.println(resultado);

        // Teste cenário 4: Dividindo dois números inteiros sendo ambos negativos
        resultado = calc.divideDoisNumerosInteiros(-3, -4);
        System.out.println(resultado);

        // Teste cenário 5: Dividindo zeros
        resultado = calc.divideDoisNumerosInteiros(0, 0);
        System.out.println(resultado);
    }

}
