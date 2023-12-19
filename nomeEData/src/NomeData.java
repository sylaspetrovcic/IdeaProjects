import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NomeData {
    public static void main(String[] args) {
        System.out.println("Informe o nome da Usuária");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        String nome = leitor.next();
        System.out.println("Informe a hora do dia");
        System.out.print(">");
        int horas = leitor.nextInt();
        if (horas > 6 && horas <=12){
            System.out.println("Bom dia Sra." + nome);
        } else if (horas >12 && horas <=18) {
            System.out.println("Boa tarde Sra." + nome);
        }
        else {
            System.out.println("Boa noite Sra." + nome);
        }
    }
}
