import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Digite o peso do pescado");
        Scanner peso = new Scanner(System.in);
        double p = peso.nextDouble();
        if (p > 50) {
            double excesso = p - 50;
            double multa = 4 * (p - 50);
            System.out.printf("O excesso de peso é : %.2f Kg\n", (p - 50));
            System.out.printf("O valor da multa a ser paga é: R$ %.2f ", (multa));
        }
        else{
            System.out.printf("O peso está dentro da lei : %.2f Kg\n",(p));
            System.out.printf("Não há multa a ser paga");
            }


        }
    }
