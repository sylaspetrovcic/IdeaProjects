public class Solution {

        public static String geraRecibo(double[] input) {
            double soma =0;
            double menor = 0;
            for (int i = 0; i < input.length; i++) {
                soma = soma + input[i];
                if(input[i] <= input[0] ){
                    menor = input[i];
                }

            }
            //System.out.println(menor);
            double valorTotal = soma;
            double valorDesconto = soma - menor * 0.50;
            double totalDesconto = menor * 0.50;



            String vlTotal = Double.toString(valorTotal);
            String vlDesconto = Double.toString(totalDesconto);
            String vlTotalComDesc = Double.toString(valorDesconto);
            //System.out.printf("Valor total = R$ %.2f \n",valorTotal);
            //System.out.printf("Valor total do desconto = R$ %.2f \n",totalDesconto);
            //System.out.printf("valor com o desconto = R$ %.2f ", valorDesconto);
            return "Valor total =  " + vlTotal + " | Valor de  descontos = " + totalDesconto +
                    " | Valor a pagar = " + valorDesconto;
        }


    public static void main(String[] args) {

        double[] input = new double[]{20,40};
        String a = ( geraRecibo(input));
        System.out.println(a);
        input = new double[]{20,40,30};
        String b = geraRecibo(input);
        System.out.println(b);
        input = new double[]{ 20,80,60,40};
        String c = geraRecibo(input);
        System.out.println(c);
    }
    }

