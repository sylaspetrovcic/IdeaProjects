public class Principal {
           public static int[][] criarMatriz(int dimensao) {
            // Criação da matriz com a dimensão fornecida
            int[][] matriz = new int[dimensao][dimensao];

            int contador = 1;
            for (int i = 0; i < dimensao; i++) {
                for (int j = 0; j < dimensao; j++) {
                    matriz[i][j] = contador;
                    contador++;
                }
            }
            return matriz;
        }
        public static void main(String[] args) {
            int dimensao = 4;

            int[][] matriz = criarMatriz(dimensao);
                for (int i = 0; i < dimensao; i++) {
                for (int j = 0; j < dimensao; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

