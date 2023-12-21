import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        System.out.println("Informe um número inteiro positivo ou negativo");
        Scanner leitor = new Scanner(System.in);
        System.out.printf(">");
        int numero = leitor.nextInt();
        if ( numero >= 0){
            System.out.println("O numero é positivo");
        }else{
            System.out.println("O número é negativo");
        }

        leitor.close();
    }
}
