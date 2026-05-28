package br.com.calculadora.operacoes;

public class ValorAbsoluto implements OperacaoMatematica{
    double a;
    public double calcular(double a, double b ){
        this.a = a;
        return Math.abs(a);
    }
}
