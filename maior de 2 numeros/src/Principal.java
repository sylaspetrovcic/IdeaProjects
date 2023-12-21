import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Informe 2 números e verifique qual é o maoir");
        System.out.println("Informe o primeiro número");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int n1 = leitor.nextInt();
        System.out.println("Informe o segundo número");
        System.out.print(">");
        int n2 = leitor.nextInt();
        if (n1 > n2 ){
            System.out.println(n1 + " é maior que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
        }
        else {
            System.out.println("Os números são iguais");
        }

    }
}
