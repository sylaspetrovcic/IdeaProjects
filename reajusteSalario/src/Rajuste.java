import java.util.Scanner;

public class Rajuste {
    public static void main(String[] args) {
        System.out.println("Informe o salário do funcionário");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double salarioAtual = leitor.nextDouble();
        double salarioAumentado;
        double aliquota1 = 1.20;
        double aliquota2 = 1.15;
        double aliquota3 = 1.10;
        double aliquota4 = 1.05;

        System.out.printf("Salário atual    \tR$ %.2f\n",salarioAtual);
        if ( salarioAtual <= 280.00){
            salarioAumentado = salarioAtual * aliquota1;
            System.out.println("percentual  aumento " + aliquota1 +"%%");
            System.out.printf("Valor do aumento \tR$ %.2f\n" ,(salarioAumentado - salarioAtual));
        } else if (salarioAtual >280.00 && salarioAtual <= 700.00) {
            salarioAumentado = salarioAtual * 1.15;
            salarioAumentado = salarioAtual * aliquota1;
            System.out.println("percentual  aumento " + aliquota2 +"%%");
            System.out.printf("Valor do aumento \tR$ %.2f\n" ,(salarioAumentado - salarioAtual));
            } else if (salarioAtual > 700.00 && salarioAtual <= 1500.00) {
            salarioAumentado = salarioAtual * aliquota3;
            System.out.println("percentual  aumento " + aliquota3 +"%%");
            System.out.printf("Valor do aumento \tR$ %.2f\n" ,(salarioAumentado - salarioAtual));
        }else {
            salarioAumentado = salarioAtual * aliquota4;
            System.out.println("percentual  aumento " + aliquota4 +"%%");
            System.out.printf("Valor do aumento \tR$ %.2f\n" ,(salarioAumentado - salarioAtual));

        }
        double valorDoAumento = salarioAumentado - salarioAtual;

        System.out.printf("Salário aumentado \tR$ %.2f",salarioAumentado);
        leitor.close();
    }
}
