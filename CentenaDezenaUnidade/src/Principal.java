import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String dez, unid, cent;
        int dezena, centena;
        System.out.println("Informe um número menor que 1000");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int x = leitor.nextInt();
        int unidade = x % 10;

        if (String.valueOf(x).length() == 3) {

            if (unidade == 1) {
                unid = "unidade";
            } else {
                unid = "unidades";
            }
            dezena = (x / 10) % 10;
            if (dezena == 1) {
                System.out.println("1 dezena");
                dez = "dezena";
            } else {
                dez = "dezenas";
            }
            centena = x / 100;
            if (centena == 1) {
                cent = "centena";
            } else {
                cent = "centenas";
            }
            System.out.println(x + " = " + centena + " " + cent + "," + dezena + " " + dez + " e " + unidade + " "
                    + unid);
        } else if (String.valueOf(x).length() == 2) {
            if (unidade == 1) {
                unid = "unidade";
            } else {
                unid = "unidades";
            }
            dezena = (x / 10) % 10;
            if (dezena == 1) {
                System.out.println("1 dezena");
                dez = "dezena";
            } else {
                dez = "dezenas";
            }
            System.out.println(x + " = " + dezena + " " + dez + " e " + unidade + " " + unid);
        }else if (String.valueOf(x).length() == 1){
            if (unidade == 1) {
                unid = "unidade";
            } else {
                unid = "unidades";
            }
            System.out.println(x + " = " + unidade + " " + unid);
        }

    }
}
