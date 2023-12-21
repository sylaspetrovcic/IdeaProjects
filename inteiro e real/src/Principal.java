
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Calculo calculo= new Calculo();
        System.out.println("Informe um número inteiro N1");
        Scanner n1 = new Scanner(System.in);
        calculo.x = n1.nextInt();
        System.out.println("informe outro número inteiro N2");
        Scanner n2 = new Scanner(System.in);
        calculo.y = n2.nextInt();
        System.out.println("Digite um número real N3");
        Scanner n3 = new Scanner(System.in);
        calculo.z = n3.nextFloat();
        System.out.println("(2 x n1) x (n2/2) = " +  calculo.itemA());
        System.out.println("3 x n1 + n3 =" + calculo.itemB());
        System.out.println("n3^3 =" + calculo.itemC());

    }
}
