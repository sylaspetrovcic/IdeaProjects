import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        System.out.println("informe 3 números e mostrar em ordem decrescente");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int x = leitor.nextInt();
        System.out.print(">");
        int y = leitor.nextInt();
        System.out.print(">");
        int z = leitor.nextInt();

        if (x > y && y > z){
            System.out.println(x + "," + y + "," + z);}
        else if ( x > y && y < z && x > z)
        {
                System.out.println(x + "," + z + "," + y);
        } else if (x < y && x > z) {
            System.out.println(y + "," + x + "," + z);
        } else  {
            System.out.println(z+ "," + y + "," + x);

        }
        leitor.close();
    }
    }

