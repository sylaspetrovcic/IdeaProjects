public class Principal {


        public static int[][] criarMatriz(int dimensao, int valor) {
            int[][] matriz = new int[dimensao][dimensao];

            for (int i = 0; i < dimensao; i++) {
                for (int j = 0; j < dimensao; j++) {
                    matriz[i][j] = valor;
                }
            }

            return matriz;
        }

        public static void exibirMatriz(int[][] matriz) {
            int dimensao = matriz.length;

            for (int[] ints : matriz) {
                for (int j = 0; j < dimensao; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            // Exemplos de criação de diferentes matrizes
            int[][] matriz3x3 = criarMatriz(3, 5);
            // Matriz 3x3 preenchida com o valor 5
            int[][] matriz5x5 = criarMatriz(5, 10);
            // Matriz 5x5 preenchida com o valor 10
            int[][] matriz10x10 = criarMatriz(10, 20);
            // Matriz 10x10 preenchida com o valor 20
            int[][] matriz100x100 = criarMatriz(100, 50);
            // Matriz 100x100 preenchida com o valor 50
            int[][] matriz1000x1000 = criarMatriz(1000, 100);
            // Matriz 1000x1000 preenchida com o valor 10

            // Exibindo as matrizes criadas
            System.out.println("Matriz 3x3:");
            exibirMatriz(matriz3x3);

            System.out.println("\nMatriz 5x5:");
            exibirMatriz(matriz5x5);

            System.out.println("\nMatriz 10x10:");
            exibirMatriz(matriz10x10);

            System.out.println("\nMatriz 100x100");
            exibirMatriz(matriz100x100);
            System.out.println("\nMatriz 1000x1000");
            exibirMatriz(matriz1000x1000);
        }
}
