import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Informe as duas notas de um aluno");
        double media;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        System.out.printf(">");
        double n1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota");
        System.out.printf(">");
        double n2 = leitor.nextDouble();
        media = (n1 + n2) / 2;
        if (media > 9) {
            System.out.println("Media de aproveitamento \t\t\t Conceito\t\t\t\tMédia\t\t\t\t\tSituação");
            System.out.println("entre 9,0 e 10,0 \t\t\t\t\t\t" + 'A'+ "  \t\t\t\t\t  " + media + "\t\t\t\t\tAprovado");
        } else if (7.5 < media && media <= 9) {
            System.out.println("Media de aproveitamento \t\t\t Conceito\t\t\t\tMédia\t\t\t\t\tSituação");
            System.out.println("entre 7,5 e 9,0 \t\t\t\t\t\t" + 'B' +"\t\t\t\t  " + media + "\t\t\t\t\tAprovado");
        } else if (6 < media && media <= 7.5) {
            System.out.println("Media de aproveitamenteo \t\t\t Conceito\t\t\t\tMédia\t\t\t\t\tSituação");
            System.out.println("entre 6,0 e 7,5 \t\t\t\t\t\t" + 'C'+ " \t\t\t\t\t  " + media + "\t\t\t\t\tAprovado");

        } else if (4.0 < media && media <= 6.0) {
            System.out.println("Media de aproveitamenteo \t\t\t Conceito\t\t\t\tMédia\t\t\t\t\tSituação");
            System.out.println("entre 4,0 e 6,0 \t\t\t\t\t\t" + 'D'+ " \t\t\t\t\t" + media + "\t\t\t\t\t\tReprovado");

        }
        else if (media <= 4.0 && media >=0) {
            System.out.println("Media de aproveitamenteo \t\t\t Conceito\t\t\t\tMédia\t\t\t\t\tSituação");
            System.out.println("entre 0,0 e 4,0 \t\t\t\t\t\t" + 'E'+ " \t\t\t\t\t" + media + "\t\t\t\t\t\tReprovado");
        }
    }
}
