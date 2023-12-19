import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {

        public static double[] custosCarro( double[] input) {
            DecimalFormat df = new DecimalFormat("#,###.00");
            df.format(input[1]/input[0]) ;
            double[] output = {(input[1]/input[0]) * 100, (input[2]/input[0] * 100)};

            System.out.printf(" [ %.2f , %.2f ] \n",output[0], output[1]);
            return output;
        }



    public static void main(String[] args) {
        double x = 121000.00,y = 14350.00,z = 21450.00;
        double[] input = new double[]{x,y,z};
        custosCarro(input);

    }
    }

