import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        System.out.println("Digite M para matutino, V para vespertino ou N para noturno");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        char periodo= leitor.next().charAt(0);
        switch (periodo){
            case 'm':
                System.out.println("Bom dia!");
                break;
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'v':
                System.out.println("Boa tarde!");
                break;
            case 'V':
                System.out.println("Bom tarde!");
                break;
            case 'n':
                System.out.println("Boa noite!");
                break;
            case 'N':
                System.out.println("Bom noite!");
                break;
            default:{
                System.out.println("Valor inválido!");
            }
        }

        leitor.close();
    }
}
