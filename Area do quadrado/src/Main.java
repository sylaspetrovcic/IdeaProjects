import java.util.Scanner;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe o valor do lado de um quadrado");
        double l;
        Scanner lado = new Scanner((System.in));
        l = lado.nextDouble();
        double a = pow(l,2);
        System.out.printf("O dobro da area do quadrado é : %.2f", (2 * a));

    }
}