import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculo aluno = new Calculo();
        System.out.println("Digite a nota do primeiro Bimestre");
        Scanner n1 = new Scanner(System.in);
        aluno.n1 = n1.nextDouble();

        System.out.println("Digite a nota do segundo Bimestre");
        Scanner n2 = new Scanner(System.in);
        aluno.n2 = n2.nextDouble();

        System.out.println("Digite a nota do terceiro Bimestre");
        Scanner n3 = new Scanner(System.in);
        aluno.n3 = n3.nextDouble();

        System.out.println("Digite a nota do quarto Bimestre");
        Scanner n4 = new Scanner(System.in);
        aluno.n4 = n4.nextDouble();

        System.out.printf("Media =  %.1f",aluno.media());
    }


}
