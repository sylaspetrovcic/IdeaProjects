import java.util.Arrays;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int[][] matrizA = new int[][]{{1,2},{3,4}};
        int[][] matrizB = new int[][]{{-1,3},{4,2}};
        int[][] matrizC = new int[2][2];
        System.out.println(matrizA.length);
        System.out.println(matrizB[0].length);
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j <matrizB.length ; j++) {
                for (int k = 0; k <matrizB.length ; k++) {
                    matrizC[i][j] =matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
                    //matrizC[i][j] += matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
                }
                
            }
            System.out.println(Arrays.toString(matrizC[i]));
        }
        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println(n);
        int[] cartela = new int[6];
        for (int i = 0; i <cartela.length ; i++) {
            cartela[i] = random.nextInt(90);

        }
        Arrays.sort(cartela);
        System.out.println(Arrays.toString(cartela));

        String[] nomes = new String[]{"Jorge-Carlos-Rocha-Sylas"};
        String[] nomes1= nomes[].split("-");
//        for (int i = 0; i < nomes.length ; i++) {
//            for (int j = 0; j < cartela.length ; j++) {
//                for (int k = 0; k <matrizB.length ; k++){
//                    nomes[0] +=  cartela[i];
//                }
                System.out.println(Arrays.toString(nomes));


            }

        }
    }

}
