import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int imc1;
        System.out.println("Informe a sua altura em m");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double altura = leitor.nextDouble();
        System.out.println("Informe seu peso");
        System.out.print(">");
        double peso = leitor.nextDouble();
        double imc = peso/(Math.pow(altura,2));
        System.out.printf("O valor de seu IMC é: %.2f \n" ,imc);
        imc1 = (int)imc;
        int a = Tabela.MAGREZA.getImc(imc1);
        switch (a){
            case 19:
            System.out.println("A altura e o peso informado corresponde a indicaçao de Magresa");
            break;
            case 24:
                System.out.println("A altura e o peso informado corresponde a indicaçao de Magresa");
                break;
            default:
                System.out.println("Fora da Escala");
                break;
        }
        System.out.println(a);

    }
}
