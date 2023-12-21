import java.util.Scanner;

public class Prinipal {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        Alunos aluno2 = new Alunos();
        Alunos aluno3 = new Alunos();
        Alunos aluno4 = new Alunos();
        int aprovados = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        System.out.print(">");
        aluno1.nome = leitor.next();
        System.out.println("Digite a nota do " + aluno1.nome);
        System.out.print(">");
        aluno1.n1 = leitor.nextDouble();
        aluno1.n2 = leitor.nextDouble();
        aluno1.n3 = leitor.nextDouble();
        aluno1.n4 = leitor.nextDouble();
        System.out.println("Digite o nome do aluno");
        System.out.print(">");
        aluno2.nome = leitor.next();
        System.out.println("Digite a nota do " + aluno2.nome);
        System.out.print(">");
        aluno2.n1 = leitor.nextDouble();
        aluno2.n2 = leitor.nextDouble();
        aluno2.n3 = leitor.nextDouble();
        aluno2.n4 = leitor.nextDouble();

        System.out.printf("A media do aluno %s é: %.2f\n", aluno1.nome, aluno1.media());
        System.out.printf("A media do aluno %s é: %.2f\n", aluno2.nome, aluno2.media());
        double[] mediaGeral={aluno1.media(),aluno2.media()};
        for (int i=0;i<2;i++){
            if(mediaGeral[i]>=7){
                aprovados++;
            }

        }
        System.out.println("O números de alunos aprovados é: " + aprovados);

        }


    }





