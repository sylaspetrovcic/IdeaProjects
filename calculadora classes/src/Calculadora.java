public class Calculadora {
    double a, b;

    public void soma(double a, double b) {
        this.a = a;
        this.b = b;
        double soma = a + b;
        System.out.println("Resultado da soma é : " + soma);
    }

    public void subtracao(double a, double b) {
        double subtracao = a - b;
        System.out.printf("Resultado da subtração é : %.2f ", subtracao);
    }

    public void multiplicacao(double a, double b) {
        double multiplicacao = a * b;
        System.out.printf("\nResultado da multiplicação é : %.2f ", multiplicacao);
    }

    public void divisao(double a, double b) {
        double divisao;
        if (b != 0) {
            divisao = a / b;
            System.out.printf("\nResultado da divisão: %.2f ", divisao);
        } else {
            System.out.println("\nDivisão por zero é impossivel");
        }
    }

    public void resto(double a, double b) {
        int resto = (int) (a % b);
        if (b != 0) {
            System.out.println("\nO resto da divisão é : " + resto);
        } else {
            System.out.println("\nDivisão por zero é impossível");
        }
    }
}

