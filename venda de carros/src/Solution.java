
import java.text.DecimalFormat;
public class Solution {
    public static double salarioComComissao( double[] input) {
        double[] output = {input[0],input[1],input[2],input[3]};
        double salarioTotal = input[2] +  input[1] * 0.05 + input[3]*input[0];
        DecimalFormat df = new DecimalFormat("0.00");
        String saida =(String.valueOf(salarioTotal));
        salarioTotal = Double.parseDouble(saida);
        //df.format(salarioTotal);
        return salarioTotal;
    }

    public static void main(String[] args) {
        int vendas =3;
        double totalVendas = 20000.00, salarioFixo = 2000.00, comissao = 250.22;
        double[] input = {vendas,totalVendas,salarioFixo,comissao};
        double a = salarioComComissao(input);
        System.out.printf("Salário mais comissão = R$ %.2f ", a);

    }
    }

