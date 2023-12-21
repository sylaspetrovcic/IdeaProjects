
    public class Solution {
        public static String geraRecibo(double[] input) {

            double menor = 0;
            double valorTotal = 0;
            for (int i = 0; i <input.length ; i++) {
              if(input[0]>= input[i]){
                  menor = menor + input[i];
                  valorTotal = valorTotal + input[i];

            }
                System.out.println(menor);
            }

            double valorTotalDescontos = menor * 0.5;
            System.out.println(valorTotalDescontos);
            double valorTotalPagar = valorTotal - valorTotalDescontos;
           /* System.out.println(menor);
            System.out.println(valorTotal);
            System.out.println(valorTotalDescontos);
            System.out.println(valotTotalPagar);*/
            String a = String.valueOf(valorTotal);
            String b = String.valueOf(valorTotalDescontos);
            String c = String.valueOf( valorTotalPagar);
            String d = "Valor total sem descontos : " + a + " | valor total dos descontos : " + b +
                    " | valor total a pagar : " + c;


            return d;
        }


    public static void main(String[] args) {
        double[] input = {20, 40};
        String a = geraRecibo(input);
        System.out.println(a);
    }
}
