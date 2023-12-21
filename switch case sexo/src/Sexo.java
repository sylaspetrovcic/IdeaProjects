import java.util.Scanner;

public class Sexo {


    public static void main(String[] args) {
        System.out.println("Digite F se mulher ou M se homem");
        Scanner leitor = new Scanner(System.in);
        System.out.printf(">");
        char s = leitor.next().charAt(0);
           // Character.toUpperCase(s);
        switch (s){
            case 'f':
                System.out.println("F - Feminino");
                break;
            case 'F':
                System.out.println("F - Feminino");
                break;
            case 'm':
                System.out.println("M- Masculino");
                break;
            case 'M':
                System.out.println("M- Masculino");
            default:
                System.out.println("Sexo inválido");
        }

    }
}
