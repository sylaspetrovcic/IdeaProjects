import java.util.Scanner;

public class LerNumero {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();
        System.out.println("O número informado foi " + num);
    }
}

