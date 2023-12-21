import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        System.out.println("Digite o nome do usuário");
        System.out.print(">");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        System.out.println("Digite a senha");
        System.out.print(">");
        String senha = leitor.next();
        while (senha.equals(nome)){
            System.out.println("A senha não pode ser igual ao nome");
            System.out.println("Digite uma nova senha");
            System.out.print(">");
            senha = leitor.next();
        }
        leitor.close();
    }
}
