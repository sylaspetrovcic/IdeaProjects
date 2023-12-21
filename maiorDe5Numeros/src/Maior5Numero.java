import java.util.Scanner;

public class Maior5Numero {
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
        int A[]={n1,n2,n3,n4,n5};
        double max = A[0];
        for (int i = 0; i <=4;i++){
            if(A[i] > max)
                max = A[i];
        }
        System.out.println("O maior número é : "+max);





        leitor.close();
    }
}
