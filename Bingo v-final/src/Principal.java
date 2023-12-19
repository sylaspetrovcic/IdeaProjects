import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Principal {
    static Scanner leitor = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("Bem-vindo ao Bingo do Rochinha!");
        System.out.println("************Menu**************");
        System.out.println("1- Jogo automático");
        System.out.println("2- Jogo Manual");
        System.out.println("******************************");
        System.out.print(">");
        int opcao = leitor.nextInt();
        System.out.print(">");
        System.out.println("Informe os nomes dos jogadores separados por hífen:");
        String getJogadores = leitor.next();
        String[] getJogadoresR = getJogadores.split("-");
        String[] jogadores = getJogadores.split("-");

        System.out.println(jogadores.length);
        int[] numerosSort = new int[0];
        if (opcao == 1) {
            // Criando um vetor de cinco inteiros para cada participante
            int[][] Participantes = new int[jogadores.length][5];
            int[][] cartelaParticipantes = new int[jogadores.length][5];
            int[] cartelas = new int[5];
            boolean[] numerosUsados = new boolean[61];
            int[] numeros = new int[5];
            Arrays.fill(numerosUsados, false);
            // Preenchendo os vetores de inteiros para cada participante

            for (int i = 0; i < jogadores.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int n;
                    do {
                        n = random.nextInt(60) + 1;
                    } while (numerosUsados[n]); // Verifica se o número já foi usado
                    numeros[i] = n;
                    numerosUsados[n] = true; // Marca o número como usado
                    cartelas[i] = numeros[i];
                    Arrays.sort(cartelas);
                    Participantes[i][j] = (i + 1) + (cartelas[j] + 1);
                    cartelaParticipantes[i][j] = (0);
                }
            }


            // Exibindo os participantes e seus números
            for (int i = 0; i < Participantes.length; i++) {
                System.out.println("Participante: " + jogadores[i]);
                System.out.println("Números:");
                System.out.println(Arrays.toString(Participantes[i]));
                System.out.println(Arrays.toString(cartelaParticipantes[i]));
                System.out.println();
            }
            // Criando um vetor de números de 1 a 60
            numerosSort = new int[60];
            for (int i = 0; i < numerosSort.length; i++) {
                numerosSort[i] = i + 1;
            }

            // Realizando múltiplos sorteios de 5 números
            for (int sorteio = 1; sorteio <= 10; sorteio++) { // Altere o número de sorteios aqui (de 1 a 10 no exemplo)
                System.out.print("Sorteio " + sorteio + ": ");
                int[] numerosSorteados = sortearNumeros(numerosSort, 5);
                for (int numeroSort : numerosSorteados) {
                    System.out.print(numeroSort + " ");
                }
                System.out.println();
            }
        } else if (opcao == 2) {
            System.out.println("Digite os números para cada jogador separados por hífen (-):");
            System.out.println("Digite números entre 1 e 60.");
            System.out.print(">");
            String entrada = leitor.next();
            jogadores = entrada.split("-");
           // String[] participantes = jogadores;
            //int[][] cartelasParticipantes = new int[participantes.length][5];
            int[] res = new int[5];


            for (int i = 0; i < jogadores.length; i++) {
                String[] numeros = jogadores[i].split(",");
                int[] cartela = new int[5];
                for (int j = 0; j < numeros.length; j++) {
                    int num;
                    //int resultado =0;
                    num = Integer.parseInt(numeros[j]);
                    cartela[j] = num;
                    res[j] = 0;


                }
                Arrays.sort(cartela);
                System.out.println(getJogadoresR[i] + Arrays.toString(cartela));
                System.out.println(Arrays.toString(res));
                // System.out.println("Cartela do jogador " + (i + 1) + ": " + Arrays.toString(cartela));
            }
            numerosSort = new int[60];
            for (int i = 0; i < numerosSort.length; i++) {
                numerosSort[i] = i + 1;
            }
            for (int sorteio = 1; sorteio <= 10; sorteio++) { // Altere o número de sorteios aqui (de 1 a 10 no exemplo)
                System.out.print("Sorteio " + sorteio + ": ");
                 int[]numerosSorteados = sortearNumeros(numerosSort, 5);
                for (int numeroSort : numerosSorteados) {
                    System.out.print(numeroSort + " ");

                }
                System.out.println();

            }
        }


    }
public static int[] sortearNumeros(int[] numeros, int quantidade) {
    Random random = new Random();
    int[] numerosSorteados = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        int indiceSorteado = random.nextInt(numeros.length - i);
        numerosSorteados[i] = numeros[indiceSorteado];

        // Trocando o número sorteado com o último número não sorteado no vetor
        int temp = numeros[indiceSorteado];
        numeros[indiceSorteado] = numeros[numeros.length - 1 - i];
        numeros[numeros.length - 1 - i] = temp;
    }
    Arrays.sort(numerosSorteados);
    return numerosSorteados;
}
}



