import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("informe o tamanho do arquivo para download em MB");
        Scanner arquivo = new Scanner(System.in);
        double arq = arquivo.nextDouble();
        System.out.println("Informe a velocidade do link");
        Scanner link = new Scanner(System.in);
        double lk = link.nextDouble();
        double tempoDowload = arq/(lk/8);
        System.out.println("O tempo estimado de download é de " + tempoDowload);
    }
}
