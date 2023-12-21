import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        System.out.println("informe dois numeros inteiros");
        System.out.println("informe o primeiro número");
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        System.out.println("informe o segundo número");
        Scanner  entrada2 = new Scanner(System.in);
        int y = entrada2.nextInt();
        int soma =  x + y;
        System.out.println("A soma é " + soma);

    }
}
