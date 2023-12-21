import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

                System.out.println("Digite uma temperatura para ser informada");
                Scanner leitor = new Scanner(System.in);
                System.out.print(">");
                double temp = leitor.nextDouble();
                System.out.println("Informe a unidade da temperatura (C, K,F)");
                System.out.print(">");
                String unidade = leitor.next().toUpperCase();

                while (unidade.isEmpty()){
                    System.out.println("Digite a unidade");
                    System.out.print(">");
                    unidade = leitor.next();}

                switch (unidade) {
                    case "C":
                        Double grausFhareinheit = (((temp * 9) / 5) + 32);
                        System.out.printf("%.1f C = %.2f F\n", temp, grausFhareinheit);
                        double grausKelvin = temp + 273.15;
                        System.out.printf("%.1f C = %.2f K\n", temp, grausKelvin);
                        break;
                    case "F":
                        double grausCelcius = (temp - 32) * 5 / 9;
                        System.out.printf("%.1f F = %.2f C\n", temp, grausCelcius);
                        grausKelvin = ((temp - 32) * 5 / 32) + 273.15;
                        System.out.printf("%.1f F = %.2f K\n", temp, grausKelvin);
                        break;
                    case "K":
                        grausCelcius = temp - 273.15;
                        System.out.printf("%.1f K = %.2f C\n", temp, grausCelcius);
                        grausFhareinheit = ((temp * (9 / 5)) + 32) - 273.15;
                        System.out.printf("%.1f K = %.2f F\n", temp, grausFhareinheit);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + unidade);

                }

            }

        }


