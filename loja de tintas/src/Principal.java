import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("informe em m3 a área a ser pintada");
        Scanner area = new Scanner(System.in);
        double a = area.nextDouble();
        double qteLitro = a / 6;
        double nLata;
        double galao;

        System.out.printf("Quantidade de tinta = %.1f l\n", (qteLitro));

        if (qteLitro % 18 == 0) {
            nLata = (qteLitro / 18);
            System.out.println("Numero de latas de tintas de 18 L: " + nLata);
        } else {
            nLata = (int) (qteLitro / 18) + 1;
            System.out.println(("O numero de latas de tintas " + nLata));
        }
        if (qteLitro % 3.6 == 0) {
            galao = (qteLitro / 3.6);
            System.out.println("A quantidade da galões é : " + galao);
        } else {
            galao = (int) (qteLitro / 3.6) + 1;
            System.out.println("A quantidade da galões é : " + galao);
        }
        double excesso;
        excesso = qteLitro * 0.10f;
        System.out.printf("o execesso deve ser de %.1f L\n ", (excesso));
        if (excesso % 18 == 0) {
            nLata = (excesso / 18);
            System.out.println("O excesso de tinta deve ser de: " + nLata);
        } else {
            galao = excesso / 3.6;
            if (galao  <= 10.8) {
                System.out.println("Número de galões de tinta de 3,6 l: " + Math.ceil(galao) + " galão");
            } else {
                System.out.println("Vale a pena comprar mais uma lata: " + 1 + " Lata");
            }
        }
    }

}
