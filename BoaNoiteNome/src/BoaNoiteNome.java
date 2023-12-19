import java.util.Scanner;

public class BoaNoiteNome {
    public static void main(String[] args) {
        System.out.println("Olá, qual é o seu nome");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
       String n = leitor.next();
        System.out.println("Boa noite, " + n);
        System.out.println("qual é o ano de seu nascimento?");
        System.out.print(">");
        int ano = leitor.nextInt();
        int idade = 2023 - ano;
        System.out.println("No final de 2023 você terá " + idade + " anos de idade");
        leitor.close();

    }

}
