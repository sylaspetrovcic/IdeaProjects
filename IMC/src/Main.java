import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe a sua altura em m");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double altura = leitor.nextDouble();
        System.out.println("Informe seu peso");
        System.out.print(">");
        double peso = leitor.nextDouble();
        double imc = peso/(Math.pow(altura,2));
        System.out.printf("O valor de seu IMC é: %.2f \n" ,imc);
        if (imc < 18.5){
            System.out.println("Corresponde a Magreza na escala de índice corporal");
        } else if (imc < 24.9) {
            System.out.println("Corresponde a Normal na escala de índice corporal");
        }
        else if ( imc < 34.9){
            System.out.println("Corresponde a obesidade Grau I na escala de índice corporal");
        }else if ( imc < 39.8){
            System.out.println("Corresponde a obesidade Grau II na escala de índice corporal");
        }
        else{
            System.out.println("Corresponde a obesidade Grau III na escala de índice corporal");
        }
        double pesoIdeal = Math.pow(altura,2) * 24.9;
        double pesoIdealI = Math.pow(altura,2) * 18.5;
        System.out.printf("Seu peso ideal é %.2f \n", pesoIdeal);
        System.out.printf("Para manter seu IMC normal seu peso pode variar de" +
                " %.2f a %.2f ", pesoIdealI,pesoIdeal);

    }
    }


