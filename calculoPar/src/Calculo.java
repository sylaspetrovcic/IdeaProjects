import javax.swing.*;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        System.out.println("Informe dois números inteiros");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        System.out.print(">");
        int x = leitor.nextInt();
        System.out.println("Informe o segundo número");
        System.out.print(">");
        int y = leitor.nextInt();
        System.out.println("*********Menu**********");
        System.out.println(" 1 - Adição");
        System.out.println(" 2 - Subtração");
        System.out.println(" 3 - Multiplicação");
        System.out.println(" 4 - Divisão");
        System.out.println("***********************");
        System.out.print(">");
        int z = leitor.nextInt();
        switch (z){
            case 1:
                int soma = x + y;
                if(soma % 2 == 0){
                    System.out.printf("O resultado da  soma, %d é par ", soma);
                }
                else{
                    System.out.printf("O resultado da  soma, %d é impar ", soma);
                }
                break;
            case 2:
                int subtracao = x - y;
                if (subtracao % 2 == 0){
                    System.out.printf("O resultado da  subtração, %d é par ", subtracao);
                }else {
                    System.out.printf("O resultado da subtração, %d é impar ", subtracao);
                }
                break;
            case 3:
                int multiplicacao = x * y;
                if (multiplicacao % 2== 0){
                    System.out.printf("O resultado da multiplicação, %d é par ",  multiplicacao);
                 }else {
                    System.out.printf("O resultado da multiplicação , %d é impar ", multiplicacao);
                }
                break;
            case 4:
                int divisao = x / y;
                if (divisao % 2 == 0){
                    System.out.printf("O resultado da divisão ,%dé par ", divisao);
                }else {
                    System.out.printf("O resultado da divisão, %d é impar ", divisao);
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + z);
        }


        leitor.close();
    }
}
