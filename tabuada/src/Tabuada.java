import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite o número que deseja gerar a tabuada");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int x = leitor.nextInt();
        for(int i =1 ; i<=10; i++){
            System.out.println(x +" X " +i +" = " + (x * i));
        }

        leitor.close();
    }
}
