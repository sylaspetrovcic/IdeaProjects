import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) {
        String data;
        System.out.print("Digite o dia: ");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        int dia = leitor.nextInt();
        System.out.print("Digite o mês: ");
        System.out.print(">");
        int mes = leitor.nextInt();
        System.out.print("Digite o ano: ");
        System.out.print(">");
        int ano = leitor.nextInt();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 && ((mes == 1 || mes == 3 || mes == 5 ||
                mes == 7 || mes == 8 || mes == 10 || mes == 12) || ((mes == 4 || mes == 6 || mes == 9 ||
                mes == 11) && dia <= 30) || (mes == 2 && (dia <= 29 && ano % 4 == 0 && (ano % 100 != 0 ||
                ano % 400 == 0)) || dia <= 28))) {
            data = "DATA VÁLIDA";
        } else {
            data = "DATA INVÁLIDA";
        }


        System.out.println(+dia + "/" + mes + "/" + ano + " " + data);
    }
}
