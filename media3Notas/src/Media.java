import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Digite três notas parciais de um aluno");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        System.out.print(">");
        double n1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota");
        System.out.print(">");
        double n2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota");
        System.out.print(">");
        double n3 = leitor.nextDouble();
        double media = (n1 + n2 + n3)/3;
        if(media == 10){
            System.out.println("Aprovado com distinção");
        } else if(media >= 7){
            System.out.printf("Aprovado com media %.1f ", media);
        }else {
            System.out.printf("Reprovado com media %.1f", media);
        }

        leitor.close();
    }

}
