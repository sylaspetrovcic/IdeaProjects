import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        System.out.println("Digite 5 números");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        System.out.print(">");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        System.out.print(">");
        int n2 = leitor.nextInt();
        System.out.println("Digite o terceiro número");
        System.out.print(">");
        int n3 = leitor.nextInt();
        System.out.println("Digite o quarto número");
        System.out.print(">");
        int n4 = leitor.nextInt();
        System.out.println("Digite o quinto número");
        System.out.print(">");
        int n5 = leitor.nextInt();
        int soma =0;

        int A[]={n1,n2,n3,n4,n5};
        for(int i=0; i<5 ; i++){
            soma = soma + A[i];
        }
        double media = soma /5;
        System.out.println("A soma dos números é :" +soma);
        System.out.println("A média dos números é :" +media);
    }
}
