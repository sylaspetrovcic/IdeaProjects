public class Principal {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int soma = 0;
        int mult = 1;

        for(int i=0; i<5;i++){
            soma = soma + num[i];
            mult = mult * num[i];
            System.out.println("os números são: " +num[i]);

        }
        System.out.println();
        System.out.printf("a soma dos números é : %d ",soma);
        System.out.println();
        System.out.printf("a multiplicação dos números é :%d  ", mult);
    }
}
