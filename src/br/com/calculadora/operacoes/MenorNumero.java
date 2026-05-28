package br.com.calculadora.operacoes;

public class MenorNumero implements OperacaoMatematica {

    public double calcular(double a, double b) {
        return Math.min(a, b);
    }
}