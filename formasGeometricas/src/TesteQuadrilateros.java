import java.util.Scanner;

public class TesteQuadrilateros {
    public static void main(String[] args) {
        System.out.println("Quantas formas deseja criar");
        Scanner leitor = new Scanner(System.in);
        int qte = leitor.nextInt();
        FormaGeometrica[] formas = new FormaGeometrica[qte];


        for (int i = 0; i < qte; i++) {
            System.out.println("Forma = " + i + 1);
            System.out.println("Qual forma deseja criar?");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("Digite a opção");
            System.out.println(">");
            int opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite a base");
                    int base = leitor.nextInt();
                    System.out.println("Digite a altura");
                    int altura = leitor.nextInt();
                    formas[i] = new Retangulos(base, altura);

                    System.out.println("Base = " + base + "," + " Altura " + altura);
                    System.out.println("Perimetro = " + formas[i].calcularPerimetro());
                    System.out.println("Área = " + formas[i].calcularArea());
                    break;

                case 2:
                    System.out.println("Digite o lado");
                    int lado = leitor.nextInt();
                    formas[i] = new Quadrado(lado);
                    System.out.println("Comprimento do lado = " + lado);
                    System.out.println("Perimetro = " + formas[i].calcularPerimetro());
                    System.out.println("Área = " + formas[i].calcularArea());
                    break;
                case 3:
                    System.out.println("Digite o raio");
                    int raio = leitor.nextInt();
                    formas[i] = new Circulo(raio);
                    System.out.println("Comprimento do raio = " + raio);
                    System.out.println("Perímetro = " + formas[i].calcularPerimetro());
                    System.out.println("Área = " + formas[i].calcularArea());
                    break;

                default:
                    System.out.println("Forma desconhecida");
                    i--;
                    break;
            }
        }


    }
}

