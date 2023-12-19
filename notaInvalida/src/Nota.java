import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
        System.out.print(">");
            double  x =leitor.nextInt();
            while(x <0 || x >10){
            System.out.println("Digite uma nota válida");
                System.out.println("Digite uma nota entre 0 e 10");
                x=leitor.nextDouble();
        }
        System.out.println("Nota válida " + x);
            leitor.close();
        }

    }



