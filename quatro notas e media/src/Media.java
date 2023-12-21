import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Digite as quatro notas do aluno");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        System.out.print(">");
        double n1 = leitor.nextDouble();
        System.out.print(">");
        System.out.println("Digite a segunda nota");
        double n2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota");
        System.out.print(">");
        double n3 = leitor.nextDouble();
        System.out.print(">");
        System.out.println("Digite a quarta nota");
        double n4 = leitor.nextDouble();
        double media = (n1 +n2 + n3 + n4)/4;
        System.out.println("As notas são :" + " n1 = " + n1 + " n2 = " + n2 + " n3 = " + n3 + " n4 = " +n4);
        System.out.printf("e a média é : %.2f " , media);
    }
}
