package br.com.calculadora.operacoes;

public class MaiorNumero implements OperacaoMatematica{
    public double calcular(double a, double b) {
        return Math.max(a, b);
    }
}
