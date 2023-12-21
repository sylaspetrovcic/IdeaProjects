import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
       int qteNotas1, qteNotas5=0;
        System.out.println("Digite o valor para saque");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double saque = leitor.nextDouble();
        if(saque >= 10 && saque <= 600){
            int centena = (int) saque / 100;
            System.out.print(centena +" Notas de R$ 100,00 ");

            int qteNotas50 = 0;
            int qteNotas10=0;
            int dezena = (int)(saque /10) % 10;
            if (dezena <5){
                qteNotas10 = dezena;
                System.out.print(qteNotas10 + " Notas de R$ 10,00 ");

            }
            else  {
                qteNotas10 = dezena - 5;
                qteNotas50 = 1;
                System.out.printf("%d notas de R$ 50,00 , %d notas de R$ 10,00 ",qteNotas50 , qteNotas10);

            }
            int unidade = (int) saque % 10;

            if(unidade < 5){
                qteNotas1 = unidade;
                System.out.print(qteNotas1 + " Notas de R$ 1,00");
            } else if (unidade == 5) {
                qteNotas5 = unidade;
                System.out.print(qteNotas5 + " Notas de R$ 5,00");
            }else {
                qteNotas1 = unidade - 5;
                qteNotas5 = 1;
                System.out.print(qteNotas5 + " Notas de R$ 5,00 " + qteNotas1 + " Notas de R$ 1,00 ");

        }


        }else {
            System.out.println("valor inválido");
        }
        leitor.close();
    }
}
