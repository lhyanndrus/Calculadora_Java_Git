package br.com.calculadora.operacoes;

public class Porcentagem implements OperacaoMatematica{
        public double calcular(double num1, double num2) {
            return (num1 * num2) / 100;
        }
}
