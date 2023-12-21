import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        System.out.println("informe os valores a,b,c de uma equação do segundo grau");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor de a");
        System.out.print(">");
        int a = leitor.nextInt();
        if (a == 0) {
           System.exit(0);

        }
        System.out.println("Informe o valor de b");
        System.out.print(">");
        int b = leitor.nextInt();
        System.out.println("Informe o valor de c");
        System.out.print(">");
        int c = leitor.nextInt();
        double r1, r2;
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta == 0) {
            r1 = -b / (2 * a);
            System.out.printf("As raizes r1 e r2 são iguais a %.2f", r1);
        } else if (delta > 0) {
            r1 = (-b + Math.sqrt(delta)) / 2 * a;
            r2 = (-b - Math.sqrt(delta) / 2 * a);
            System.out.printf("As raizes reais r1 =  %.2f e r2 = %.2f ", r1, r2);
        } else if (delta < 0) {
            System.out.println("A equação não tem solução no conjunto Real ");
        }


        leitor.close();
    }
}
