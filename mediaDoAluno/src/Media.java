import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Informe a primeira nota do aluno");
        Scanner leitor = new Scanner(System.in);
        System.out.printf(">");
        double n1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota do aluno");
        System.out.printf(">");
        double n2 = leitor.nextDouble();
        double media = (n1 + n2)/2;
        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (10 < media || media >=7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


        leitor.close();
    }
}
