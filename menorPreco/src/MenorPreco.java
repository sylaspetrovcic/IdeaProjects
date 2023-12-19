import java.util.Scanner;

public class MenorPreco {
    public static void main(String[] args) {
        System.out.println("Informe o preço do produto n1");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double n1 = leitor.nextDouble();
        System.out.print(">");
        double n2 = leitor.nextDouble();
        System.out.print(">");
        double n3 = leitor.nextDouble();

        if(n1 < n2 && n1 < n3){
            System.out.printf("O produto a ser comprado é o que custa R$ %.2f " ,n1);
        } else if (n1 > n2 && n2 > n3) {
            System.out.printf("O produto a ser comprado é o que custa R$ %.2f ", n3);
        }
        else {
            System.out.printf("O produto a ser comprado é o que custa R$ %.2f  ",n2);
        }
    }
}
