public class ParesImpares {
    public static void main(String[] args) {
        int A[] = {2, 3, 4, 6, 7, 8, 9, 10, 12};
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < 9; i++) {
            if (A[i] % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }

        }
        System.out.println("O numero de pares é " + pares);
        System.out.println("O numero de impares é " + impares);
    }
}
