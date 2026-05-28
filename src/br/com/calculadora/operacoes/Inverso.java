import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitor.nextDouble();

        // Se o número for zero, avisa que não dá
        if (numero == 0) {
            System.out.println("Não existe inverso de zero!");
        }
        // Se NÃO for zero, chama o método que isola a conta
        else {
            // Chamamos o método e guardamos o 'return' dele na variável resultado
            double resultado = calcularInverso(numero);
            System.out.println("O inverso é: " + resultado);
        }

        leitor.close();
    }

    // NOVO MÉTODO: Ele recebe um número e RETORNA um double
    public static double calcularInverso(double num) {
        double inverso = 1.0 / num;
        return inverso; // Agora o return funciona perfeitamente!
    }
}