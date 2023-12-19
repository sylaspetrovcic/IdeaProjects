import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em graus Fhareinheit");
        Scanner temperatura = new Scanner(System.in);
        double t = temperatura.nextDouble();
        double c = 5 * ((t -32)/9);
        System.out.printf("A temperatura em graus celsius é %.2f", c);

    }
}