package br.com.calculadora.operacoes;

public class ArredondarCima implements OperacaoMatematica{
    @Override
    public double calcular(double a, double b){
        return Math.ceil(a);
        //cabô
    }
}