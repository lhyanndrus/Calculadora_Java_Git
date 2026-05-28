package br.com.calculadora.operacoes;

public class ArredondarParaBaixo implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b) {
        return Math.floor(a);
    }
}
