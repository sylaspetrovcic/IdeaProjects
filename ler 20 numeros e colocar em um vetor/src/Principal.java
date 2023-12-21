import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = 20;
        int v[] = new int[n];
        int i;
        int p = 0;
        int imp = 0;
        var par = new int[20];
        int[] impar = new int[20];
        //int par[] = new int[];
        System.out.println("Digite 20 números para colocar em um vetor");
        for (i = 0; i < n; i++) {
            v[i] = leitor.nextInt();

        }

        for (i = 0; i < n; i++) {
            System.out.println(v[i]);

        }

        for (i = 0; i < n; i++) {

            if (v[i] % 2 == 0) {
                par[i] = v[i];
                System.out.println(par[i]);

            }
        }
        System.out.println("\n");
            for (i = 0; i < n; i++) {

                if (v[i] % 2 != 0) {
                    impar[i] = v[i];
                    System.out.println(impar[i]);

                }

            }
        }

    }



