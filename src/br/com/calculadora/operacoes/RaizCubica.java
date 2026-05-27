package br.com.calculadora.operacoes;

public class RaizCubica implements OperacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        return Math.cbrt(a);
    }
}
