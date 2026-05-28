package br.com.calculadora.operacoes;
import java.util.Scanner;


public class LogaritmoNatural {
        public static double calcularLogNatural(double a) {
            if (a <= 0) {
                System.out.println("Erro: O número deve ser maior que zero.");
                return Double.NaN;
            }
            return Math.log(a);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor de 'a' para calcular o logaritmo natural: ");
            double valorUsuario = scanner.nextDouble();

            double resultado = calcularLogNatural(valorUsuario);

            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado (log): " + resultado);
            }

            scanner.close();
        }
    }

