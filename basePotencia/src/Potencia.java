import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        System.out.print(">");
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        System.out.println("Digite a potência");
        System.out.print(">");
        int b = leitor.nextInt();
        int potencia =0;
        for(int i = 1; i <=b;i++){
            potencia = a *A[i];
        }
        System.out.println(potencia);
        leitor.close();
    }
}
