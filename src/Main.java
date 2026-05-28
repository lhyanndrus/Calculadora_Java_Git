import br.com.calculadora.operacoes.OperacaoFactory;
import br.com.calculadora.operacoes.OperacaoMatematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("===============================================");
        System.out.println("    BEM-VINDO À CALCULADORA COLABORATIVA       ");
        System.out.println("               Projeto: Calculadora_Aula        ");
        System.out.println("===============================================");
        System.out.println("Comandos disponíveis: ");
        System.out.println("[Básicos]: som, sub, mul, div, res, med");
        System.out.println("[Médios]:  pot, rqd, rcu, max, min, por, abs");
        System.out.println("[Avançados]: hip, art, atr, sen, cos, tan, log, lg1, cei, flo, inv, fat");
        System.out.println("===============================================");

        while (continuar) {
            System.out.print("\nDigite o primeiro número (ou use para operações de 1 valor): ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o comando de 3 letras da operação (ou 'sair'): ");
            String comando = scanner.next();

            if (comando.equalsIgnoreCase("sair")) {
                continuar = false;
                System.out.println("\nCalculadora encerrada com sucesso!");
                break;
            }

            System.out.print("Digite o segundo número (digite 0 se a operação usar apenas 1 valor): ");
            double num2 = scanner.nextDouble();

            // Busca a operação correspondente criada pelos alunos através da Fábrica
            OperacaoMatematica operacao = OperacaoFactory.obterOperacao(comando);

            if (operacao != null) {
                try {
                    // Executa o cálculo polimórfico
                    double resultado = operacao.calcular(num1, num2);
                    System.out.println("----------------------------------------");
                    System.out.printf("RESULTADO: %.4f\n", resultado);
                    System.out.println("----------------------------------------");
                } catch (ArithmeticException e) {
                    System.out.println("\n[ERRO MATEMÁTICO]: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("\n[ERRO INESPERADO]: Ocorreu um problema ao calcular.");
                }
            } else {
                System.out.println("\n[AVISO]: Comando inválido ou operação ainda não integrada via Pull Request!");
            }
        }
        scanner.close();
    }
}
