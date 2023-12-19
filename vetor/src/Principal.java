public class Principal {
    public static void main(String[] args) {
        int[] vet = new int[]{1, 3, 6, 8, 10};
        System.out.printf("o vetor vet = {");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d, ", vet[i]);
        }
        System.out.printf("}");
    }
}
