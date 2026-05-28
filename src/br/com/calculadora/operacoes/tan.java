import java.util.Scanner;
public class tan{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o grau da tangente: ");
        double graus = sc.nextDouble();

        double radianosGraus = Math.toRadians(graus);
        double tangenteGraus = Math.tan(radianosGraus);

        System.out.println("Tangente de " + graus + " Graus: " + tangenteGraus);
    }
}