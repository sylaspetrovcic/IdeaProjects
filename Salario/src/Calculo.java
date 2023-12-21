import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        System.out.println("Quanto voc`ganha por hora?");
        Scanner ganhaPorHora = new Scanner(System.in);
        double gl = ganhaPorHora.nextDouble();
        System.out.println("Quantas horas você trabalhou no mês?");
        Scanner horas = new Scanner(System.in);
        double h = horas.nextDouble();
        double salario = gl * h;
        System.out.printf("O salário neste mês será R$ %.2f",( salario));
    }
}
