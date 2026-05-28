package br.com.calculadora.operacoes;
import java.util.Scanner;

public class LogaritmoBase10 implements OperacaoMatematica {
    Scanner sc = new Scanner(System.in);
    double precisao = 0.001;
    double quebrado = 0;
    double bit = 0.5;
    double resultado = 0;
    int casasDecimais = 0;

    public double calcular(double logaritmando, double b) {
        if(logaritmando > 0) {

            if(logaritmando >= 10) {
                logaritmando /= 10;
                casasDecimais++;
            } else if(logaritmando < 1) {
                logaritmando *= 10;
                casasDecimais--;
            }

            while(bit > precisao && logaritmando != 1) {
                logaritmando *= logaritmando;
                if(logaritmando >= 10) {
                    quebrado += bit;
                    logaritmando /= 10;
                }
                bit /= 2;
            }
        } else {
            System.out.println("Logaritmando negativo não é válido!");
        }
        return casasDecimais + quebrado;
    }
}
