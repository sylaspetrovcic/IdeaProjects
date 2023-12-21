public class Principal {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3];
        String[][] resultado = new String[3][3];
        String[][] alunos = new String[][]{{"Ana", "Leo", "Mia"}, {"Ben", "Kai", "Eva"}, {"Lia", "Sam", "Zoe"}};
        System.out.println("Alunos");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(alunos[i][j] + " ");
            }
            System.out.println();
        }
        resultado[0][0] = media(10, 6);
        resultado[1][0] = media(7, 1);
        resultado[2][0] = media(9, 5);
        resultado[0][1] = media(2, 8);
        resultado[0][2] = media(9, 8);
        resultado[1][1] = media(7, 10);
        resultado[1][2] = media(9, 10);
        resultado[2][1] = media(8, 6);
        resultado[2][2] = media(8, 5);
        //resultado[2][2] = media(8,5);

        System.out.println("Resultados");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
     
    }
    private static String media(int a, int b) {
        int media = (a + b)/2;
        if (media> 5){
            return "A";
        }else {
            return "R";
        }
    }

}
