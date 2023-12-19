import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int x,y,z;
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        x = leitor.nextInt();
        System.out.print(">");
        y = leitor.nextInt();
        z = x;
        x = y;
        y = z;
        System.out.printf("%d, %d " ,x ,  y);


    }
}
