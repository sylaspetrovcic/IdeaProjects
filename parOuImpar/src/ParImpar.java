import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int x = leitor.nextInt();
        if ( x % 2 ==0){
            System.out.printf("O número %d é par ",x);
        }
        else{
            System.out.printf("O número %d é impar ",x);
        }

        leitor.close();
    }
}
