import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.print("Digite um valor decimal valido");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("entrada invalida .. ");
            scanner.next();
        }
        double valor = scanner.nextDouble();
        int[] a = {1, 2, 3};
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
