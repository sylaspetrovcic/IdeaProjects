import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double pesoIdeal;
        System.out.println("Digite a altura de uma pessoas em metros");
        Scanner altura = new Scanner((System.in));
        double h = altura.nextDouble();
        System.out.println("Digite f para mulher ou m para homem");
        Scanner sexo = new Scanner(System.in);
        String s = sexo.next();
        if (s == "f") {
            pesoIdeal = (62.1 * h) - 44.7;
            System.out.printf("Seu peso ideal é %.2f kg", (pesoIdeal));
        } else {
            pesoIdeal = (72.7 * h) - 58;
            System.out.printf("Seu peso ideal é %.2f kg", (pesoIdeal));
        }
    }
}
