package br.com.calculadora.operacoes;

public class Inverso implements OperacaoMatematica {

    public double calcular(double num1, double num2) {
        // Verifica se o primeiro número é zero
        if (num1 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }

        // Retorna o inverso (1 dividido pelo número)
        return 1 / num1;
    }
}