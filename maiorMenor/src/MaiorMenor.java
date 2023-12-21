import java.util.Scanner;

public class MaiorMenor {

        public static void main(String[] args) {
            System.out.println("informe 3 números");
            System.out.println("informe o primeiro número");
            Scanner leitor = new Scanner(System.in);
            System.out.print(">");
            int n1 = leitor.nextInt();
            System.out.println("informe o segundo número");
            System.out.print(">");
            int n2 = leitor.nextInt();
            System.out.println("Informe o terceiro número");
            System.out.print(">");
            int n3 = leitor.nextInt();
            if (n1 > n2 && n1 > n3 ){
                System.out.println(" O maior número é " + n1);
                            }
            else if (n1 < n2 && n2 > n3 ) {
                System.out.println(" O maior número é " + n2);
                            }
            else {
                System.out.println(" O maior número é " + n3);
            }
            if(n1 < n2 && n1 < n3){
                System.out.println("O menor número é "+n1);
            } else if (n1 > n2 && n2 > n3) {
                System.out.println("O menor número é "+ n3);
            }
            else {
                System.out.println("O menor número é o "+n2);
            }

            leitor.close();
        }

}
