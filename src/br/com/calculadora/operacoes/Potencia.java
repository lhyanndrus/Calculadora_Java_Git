package br.com.calculadora.operacoes;


public class Potencia implements OperacaoMatematica {
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}
