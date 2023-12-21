import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em graus Celsius");
        Scanner celsius = new Scanner(System.in);
        double c = celsius.nextDouble();
        double f = (9 * c)/5 + 32;
        System.out.printf("A temperatura em graus Fhareinheit é %.2f", f);
    }
}
