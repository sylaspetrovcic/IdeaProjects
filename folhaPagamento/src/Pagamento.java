import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        System.out.println("Digite o número de horas");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int horasTrabalhadas = leitor.nextInt();
        System.out.println("Digite o valor da hora trabalhada");
        double valorHoraTrabalhada = leitor.nextDouble();
        double salarioBruto = valorHoraTrabalhada * horasTrabalhadas;
        double fgts = salarioBruto * 0.11;
        double sindicato = salarioBruto * 0.03;
        double inss = 0.10;
        double ir;

        if (salarioBruto <= 900){
            ir =0;
        } else if (salarioBruto <= 1500) {
            ir= 0.05;
            } else if (salarioBruto <= 2500) {
            ir = 0.10;
        }
        else{
            ir = 0.20;
        }
        double totalDescontos = salarioBruto*inss + salarioBruto*ir + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.printf("salário Bruto: (%x * %.0f) \t\t:R$ %.2f\n ", horasTrabalhadas,valorHoraTrabalhada,salarioBruto );
        System.out.printf("- IR (%.1f)%%   \t\t\t\t:R$ %.2f  \n",ir*100,salarioBruto*ir);
        System.out.printf("- INSS (%.1f)%%  \t\t\t\t:R$ %.2f\n",inss*100, salarioBruto*inss);
        System.out.printf("FGTS (11)%% \t\t\t\t\t\t:R$ %.2f\n",salarioBruto*0.11);
        System.out.printf("Total de descontos \t\t\t\t:R$ %.2f\n",totalDescontos);
        System.out.printf("Salário líquido \t\t\t\t:R$ %.2f\n",salarioLiquido);






        leitor.close();;
    }
}
