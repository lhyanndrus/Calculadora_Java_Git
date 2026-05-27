package br.com.calculadora.operacoes;

import java.util.Scanner;

public class Hipotenusa implements OperacaoMatematica {
    @Override
    public double calcular(double a, double b){
        return Math.hypot(a, b);
    }
}

