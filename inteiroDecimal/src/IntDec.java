import java.util.Scanner;

public class IntDec {
    public static void main(String[] args) {
        System.out.println("Digite um número qualquer");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double x = leitor.nextDouble();
        //System.out.println(Math.ceil(x));

        System.out.println(verificarValor( x));
        if (verificarValor(x) == false){
            System.out.println("O número é inteiro");
        }
        else {
            System.out.println("O número é decimal " + x);
            System.out.println("Aproximando o número para o inteiro superior fica " + Math.ceil(x));
        }

        leitor.close();
    }

    private static boolean verificarValor(double x) {
        //public static boolean verificarValor;
        double valor = x;
        {
            if (valor > Math.floor(x)) {
                return true;
            } else {
                return false;
            }
    }


        }


}
