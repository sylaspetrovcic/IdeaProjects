import java.util.Scanner;
import static java.lang.Math.pow;

public class Area {
    public static void main(String[] args) {
        double raio;
        System.out.println("Informe o raio do circulo");
        Scanner r = new Scanner(System.in);
        raio = r.nextDouble();
        double area = Math.PI * pow(raio,2);
        System.out.printf("A área do círculo é :%.2f " , (area));
    }
}
