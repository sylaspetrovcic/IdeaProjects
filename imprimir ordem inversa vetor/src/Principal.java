public class Principal {
    public static void main(String[] args) {
        int[] vet = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("imprimir na ordem inversa");
        for( int i = 9; i>=0;i--){
            System.out.printf("%d, ",vet[i]);
        }
    }
}
