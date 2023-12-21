    public class Solution {
        public static double[] custosCarro( double[] input) {
            double[] output = new double[input.length];
            System.arraycopy(input, 0, output, 0, input.length);
            double[] saida = {output[0] / output[1],output[0] / output[2]};

                System.out.printf("[ %.2f , %.2f ]\n", saida[0],saida[1]);



        return null;
        }


    public static void main(String[] args) {
        double[] input= {100000.00,  12000.00,  20000.00};
        custosCarro(input);

    }
}
