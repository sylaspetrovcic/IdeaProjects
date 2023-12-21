import java.lang.reflect.Array;
import java.util.Scanner;

public class TesteQuadrilateros {
    public static void main(String[] args) {
        System.out.println("Quantas formas deseja criar");
        Scanner leitor = new Scanner(System.in);
        int qte = leitor.nextInt();
        if (qte >= 1 || qte <= 3) {
            for (int i = 0; i < qte; i++) {
                System.out.println("Qual forma deseja criar?");
                String forma = leitor.next();
                forma.toLowerCase();
                switch (forma){
                    case "retângulos":
                        System.out.println("Digite a base");
                        int base = leitor.nextInt();
                        System.out.println("Digite a altura");
                        int altura = leitor.nextInt();
                        Retangulos retangulos = new Retangulos(base,altura);
                        System.out.println("Base = " + base + "," + " Altura " + altura);
                        System.out.println("Perimetro = " + retangulos.calcularPerimetro());
                        System.out.println("Área = " + retangulos.calcularArea());
                        break;

                    case "quadrado":
                        System.out.println("Digite o lado");
                        int lado = leitor.nextInt();
                        Quadrado quadrado = new Quadrado(lado);
                        System.out.println("Comprimento do lado = " + lado);
                        System.out.println("Perimetro = " + quadrado.calcularPerimetro());
                        System.out.println("Área = " + quadrado.calcularArea());
                        break;
                    case  "circulo":
                        System.out.println("Digite o raio");
                        int raio = leitor.nextInt();
                        Circulo circulo = new Circulo(raio);
                        System.out.println("Comprimento do raio = " + raio);
                        System.out.println("Perímetro = " + circulo.calcularPerimetro());
                        System.out.println("Área = "+ circulo.calcularArea());
                        break;

                    default:
                        System.out.println("Forma desconhecida");
                }
            }


        }else {
            System.out.println("Número de formas inválido");

        }
       String[] formasGeometricas = new String[qte];
        formasGeometricas[0]="Quadrado";
        formasGeometricas[1] = "Retângulos";
        formasGeometricas[2] = "Circulo";
    }
}