import java.util.Scanner;
import static java.lang.Math.pow;

public class Principal {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        System.out.println("Digite os números de uma equação do segundo grau ");
        System.out.println("Digite a");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        a = leitor.nextDouble();
        if (a != 0) {
            System.out.print(">");
            b = leitor.nextDouble();
            System.out.print(">");
            c = leitor.nextDouble();
            delta = (pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("Não existe raiz no conjunto dos reais");
            } else if (delta == 0) {
                x1 = ((b + delta) / 2 * a);
                System.out.println("As raizes x1 e x2 são iguais = " + x1);
            } else {
                x1 = (b - delta) / (2 * a);
                x2 = (b + delta) / (2 * a);
                System.out.printf(" as raizes são: x1 = %.2f e x2 = %.2f ", x1, x2);
            }
        } else {
            System.out.println("A equação não é do segundo grau");

            }

    }
}
