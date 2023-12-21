import java.util.Scanner;
import java.text.NumberFormat;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Quanto você ganha por hora?");
        Scanner  valorHora = new Scanner(System.in);
        float hora = valorHora.nextFloat();
        System.out.println("Qual é o número de hora trabalhadas no mês?");
        Scanner horasTrabalhadas = new Scanner(System.in);
        float valor = horasTrabalhadas.nextFloat();
        float total = valor * hora;
        float inss = total * 0.08f;
        float sindicato = total * 0.05f;
        float irpf = (total - inss) * 0.11f;
        System.out.printf("+ salário bruto : R$ %.2f\n",(total));
        System.out.println("- IR (11%) : R$ " + NumberFormat.getCurrencyInstance().format(irpf));
        System.out.println("- INSS (8%): R$ " + NumberFormat.getCurrencyInstance().format(inss));
        System.out.println("- Sindicato (5%): R$ " +NumberFormat.getCurrencyInstance().format(sindicato));
        System.out.printf("= salário Líquido : R$ %.2f",(total - inss - irpf - sindicato));

    }

}
