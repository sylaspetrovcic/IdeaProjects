public class Teste {


    public static void main(String[] args) {
        double numero = -9;
        try {
            double resultado = calcularRaizQuadrada(numero);
            System.out.println("Raiz quadrada de " + numero + " é: " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }


    private static double calcularRaizQuadrada(double numero) {
        if (numero < 0) {
            throw new NumeroNegativoException("Raiz Negativa. Valor " + numero + "!");
        }
        return Math.sqrt(numero);
    }


    // Classe de exceção personalizada
    static class NumeroNegativoException extends RuntimeException {
        public NumeroNegativoException(String mensagem) {
            super(mensagem);
        }
    }
}

