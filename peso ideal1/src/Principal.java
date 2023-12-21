import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Cálculo do peso ideal");
        System.out.println("Digite a altura da pessoa");
        Scanner altura = new Scanner(System.in);
        double h = altura.nextDouble();
        double peso = 72.7 * h - 58;
        System.out.printf("O peso ideal é %.2f Kg",(peso));
    }

}
