package br.com.calculadora.operacoes;

public class Fatorial implements OperacaoMatematica{
    double a;
    public double calcular(double a, double b) {
        this.a = a;
        double fat = 1;
        double contador = a;
        for(int cont = 0; cont < contador; cont++) {
            fat *= a;
            a--;
        }
        return fat;
    }
}
