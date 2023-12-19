import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int x = leitor.nextInt();
        int fatorial = 1;
        if (x == 0 || x == 1)
            System.out.println("Fatorial de " + x + " é " + fatorial);
        else{
            for (int i =1; i <= x; i++){
                fatorial = fatorial * i;

            }
            System.out.println("Fatorial de " + x + " é " + fatorial);
        }
        leitor.close();
    }
}
