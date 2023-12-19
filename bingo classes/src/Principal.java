import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao  Bingo do Rochinha!");
        System.out.println("Opções : ");
        System.out.println("1. Iniciar jogo");
        System.out.println("2. Sair");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            String[] jogadores = getJogadores(); 
            jogarBingo();
        } else {
            System.out.println("Jogo encerrado. Até mais!");
        }
    }

    private static void jogarBingo() {
        String[][] cartelas = gerarCartelas(getJogadores().length)
    }

    private static String[][] gerarCartelas(int length) {
    }


}
    private static String[] getJogadores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os nicknames dos jogadores separados por hífen:");
        String jogadores = scanner.nextLine();
        return jogadores.split("-");
    }
}
