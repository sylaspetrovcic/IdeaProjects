import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    static Scanner leitor = new Scanner(System.in);
    private static String jogadores;
    static Random random = new Random();


    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Bingo do Rochina!");
        System.out.println("_____________________________________________");
        System.out.println("Informe os nomes dos participantes separados por hífen");
        System.out.print(">");
        String nomes = leitor.nextLine();
        String[] jogadores = nomes.split("-");
        String[][] cartelas = new String[jogadores.length][5];
        int[] cartela = new int[jogadores.length];
        String[] cartelaManual = new String[5];
        int[] cartelaAuto = new int[5];
        int[] cartelaConferencia = {0, 0, 0, 0, 0};

        System.out.println("Opções de comando: ");
        System.out.println("1. Iniciar jogo no modo automático");
        System.out.println("2. Gerar as cartelas manualmente ");
        System.out.println("4. Sair");
        int opcao = leitor.nextInt();
        if (opcao == 1) {
            System.out.println("Gerando cartelas");
            for (int i = 0; i < jogadores.length; i++) {

                for (int j = 0; j < 5; j++) {
                    int n = random.nextInt(60);
                    if(n != 0){
                        cartelaAuto[j] = n;
                        System.out.println(Arrays.toString(new int[]{cartelaAuto[j]}));
                }

                }
                System.out.println("Participante: " + jogadores[i]);
                System.out.println("Números:");

                System.out.println();
            }
        }
    }
}








// for (int i = 0; i < 60; i++) {
//        array[i] = i + 1;
//        }
//        for (int i = array.length - 1; i > 0; i--) {
//        int j = (int) (Math.random() * (i + 1));
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//        }
//        }