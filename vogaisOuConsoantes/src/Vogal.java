import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        System.out.println("Digite uma letra e verifique se é vogal ou consoante");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        char letra = leitor.next().charAt(0);
        switch (letra){
            case 'a':
                System.out.println("É vogal");
                break;
            case 'A':
                System.out.println("É vogal");
                break;
            case 'e':
                System.out.println("É vogal");
                break;
            case 'E':
                System.out.println("É vogal");
                break;
            case 'i':
                System.out.println("É vogal");
                break;
            case 'I':
                System.out.println("É vogal");
                break;
            case 'o':
                System.out.println("É vogal");
                break;
            case 'O':
                System.out.println("É vogal");
                break;
            case 'u':
                System.out.println("É vogal");
                break;
            case 'U':
                System.out.println("É vogal");
                break;
            default:{
                System.out.println("É consoante");
            }

        }

    }
}
