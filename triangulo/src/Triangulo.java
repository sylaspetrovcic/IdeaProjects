import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        System.out.println("informe as medidas dos três lados de um triângulo");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int ladoA = leitor.nextInt();
        System.out.print(">");
        int ladoB = leitor.nextInt();
        System.out.print(">");
        int ladoC = leitor.nextInt();
        if (ladoA + ladoB > ladoC){
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("É um triângulo equilátero");
            } else if ( ladoA != ladoB && ladoB != ladoC) {
                System.out.println("É um triângulo escaleno");
            }else {
                System.out.println("É um triângulo isóceles");
            }
        }else {
            System.out.println("não é um triângulo");
        }
    }
}
