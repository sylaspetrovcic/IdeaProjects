import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Transformar metros em centimetros");
        System.out.println("Digite a medida em metros");
        double cm;
        Scanner metro = new Scanner(System.in);
        double m = metro.nextDouble();
        cm = m *1000;
        System.out.print(m + " m corresponde a " + cm + " cm");


    }
}