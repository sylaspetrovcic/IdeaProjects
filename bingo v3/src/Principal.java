import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Principal {
    private static String jogadores;
    private static int[] sorteadas;


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        System.out.println("****************************************");
        System.out.println("Bem-vindo ao Bingo do Rochinha!");
        System.out.println("************Menu**************");
        System.out.println("1- inserir os jogadores");
        System.out.println("2- Sair");
        int opcao = leitor.nextInt();
        if (opcao == 1) {
            System.out.println("Informe os nomes dos jogadores separados por hífen:");
            String getJogadores = leitor.next();
             String[] jogadores = getJogadores.split("-");
            System.out.println(jogadores.length);
            String[][] cartelas = gerarCartelas(jogadores,jogadores.length);
            int[] numerosSorteados = new int[5];
           Arrays.fill(numerosSorteados,0);
            int rodada = 1;
            while (rodada <4) {
                System.out.println("Rodada " + rodada);
                exibirCartelas(cartelas,jogadores);
                System.out.println("Opções de comando: ");
                System.out.println("1. Sorteio automático");
                System.out.println("2. Sorteio manual");
                 opcao = leitor.nextInt();
                if (opcao == 1) {
                    sorteadas = sorteioAutomatico(numerosSorteados);
                    exibirResultados(rodada, jogadores, cartelas, numerosSorteados);
                    rodada++;

                } else if (opcao == 2) {
                    sorteioManual(numerosSorteados);

                }
                     System.out.println(Arrays.toString(numerosSorteados));
        }
            Estatistica(rodada -1,jogadores,cartelas,numerosSorteados);
            //verificarCartela(cartelas,numerosSorteados);

    }

    }

    private static void exibirCartelas(String[][] cartelas, String[] jogadores) {
        for (int i = 0; i < cartelas.length; i++) {
            System.out.println("Cartelas do jogador " + jogadores[i] + " : ");
            for (int j = 0; j < 5; j++) {
                System.out.println(cartelas[i][j]);
            }
        }
    }

    private static void Estatistica(int rodadas, String[] jogadores, String[][] cartelas, int[] numerosSorteados) {
        System.out.println("Fim do jogo. Quem se deu bem?");
        for (int j = 0; j <jogadores.length ; j++) {
            System.out.println("Jogador " + (j + 1) + " - " + jogadores[j] + " : ");
            System.out.println("Cartela : ");
            for (int k = 0; k < cartelas[j].length; k++) {
                System.out.println(cartelas[j][k]);

            }
            System.out.println();
        }
        System.out.println("Número total de rodadas: " + rodadas);
    }


    private static void exibirResultados(int rodada, String[] jogadores, String[][] cartelas,
                                         int[] numerosSorteados) {
        System.out.println("Resultados da rodada " + rodada + " : ");
        for (int i = 0; i < jogadores.length ; i++) {
            System.out.println("Jogador " + (i + 1) + " - " + jogadores[i] + " :");
            System.out.println("Cartela:");
            for (int j = 0; j < cartelas[i].length; j++) {
                System.out.println(cartelas[i][j]);
            }
           // System.out.println("Bingo: " + (verificarCartela(cartelas[i], numerosSorteados) ? "Sim" : "Não"));
            System.out.println();
        }
    }
//   private static boolean verificarCartela(String[][] cartela, int[] numerosSorteados) {
//        for (int i = 0; i < cartela.length; i++) {
//            String numero = String.valueOf(cartela);
//         String[] numerosCartela = numero.split("-");
//            for (int j = 0; j < 5; j++) {
//              int num = Integer.parseInt(numero);
//                if(numerosSorteados[num - 1] == -1){
//                    return false;
//                }
//                }
//            }
//        return true;
//        }
        private static void sorteioManual(int[] numerosSorteados) {
        Scanner leitor = new Scanner(System.in);
        int numeroSorteado;
        do
        {numeroSorteado = leitor.nextInt();
            if(numeroSorteado < 1 || numeroSorteado > 60){
                System.out.println("Número inválido. Digite de novo");
        }else if (numerosSorteados[numeroSorteado -1] != -1){
                System.out.println("Número já tirado. Digite novamente");
        }
            }while(numeroSorteado < 1 || numeroSorteado >60 || numerosSorteados[numeroSorteado -1] != -1);
                    numerosSorteados[numeroSorteado - 1] = 1;

        }
    


    private static int[] sorteioAutomatico(int[] numerosSorteados) {
        Random random = new Random();
        int num;
        for (int i = 0; i < 5; i++) {
            num = random.nextInt(1,60) + 1;

            numerosSorteados[i] = num;
        }
        return numerosSorteados;
    }


        private static boolean bingo (String[][]cartelas){
            for (String[] cartela : cartelas) {
                if (!Arrays.asList(cartela).contains(-1)) {
                    return true;
                }
            }
            return false;
        }

        private static String[][] gerarCartelas (String[] jogadores, int qteJogadores){
            String[][] cartelas = new String[qteJogadores][5];
            Scanner leitor = new Scanner(System.in);
            for (int i = 0; i < qteJogadores; i++) {

                System.out.println("Gerando cartela para " + jogadores[i]);
                System.out.println("Opções de jogo");
                System.out.println("1 - Gerar automáticamente");
                System.out.println("2 - Gerar manualmente");
                int escolha = leitor.nextInt();
                if (escolha == 1) {

                    cartelas[i] = cartelaAutomatica();
                } else if (escolha == 2) {
                    cartelas[i] = cartelaManual();
                } else {
                    System.out.println("Escolha inválida");
                    i--;
                }
            }
            return cartelas;
        }
        private static String[] cartelaManual () {
            String[] cartela = new String[5];
            Scanner leitor = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite os números " + i + 1 + "separados por virgula");
                cartela[i] = leitor.nextLine();
            }
            return cartela;
        }
        private static String[] cartelaAutomatica () {
            String[] cartela = new String[5];
            for (int i = 0; i < 5; i++) {
                StringBuilder linha = new StringBuilder();
                Random random = new Random();
                for (int j = 0; j < 5; j++) {
                    int num = random.nextInt(60) + 1;
                    linha.append(num).append(",");
                }
                cartela[i] = linha.substring(0, linha.length() - 1);
            }
            return cartela;
        }


    }
