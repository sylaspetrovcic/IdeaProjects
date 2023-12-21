public class Principal {
//caso 1
        public static void main(String[] args) {
            int numeroDecimal = 100;

            String numeroBinario = Integer.toBinaryString(numeroDecimal);
            String numeroOctal = Integer.toOctalString(numeroDecimal);
            String numeroHexadecimal = Integer.toHexString(numeroDecimal);

            System.out.println("Decimal: " + numeroDecimal);
            System.out.println("Binário: " + numeroBinario);
            System.out.println("Octal: " + numeroOctal);
            System.out.println("Hexadecimal: " + numeroHexadecimal);

             numeroBinario = "1101";

            numeroDecimal = Integer.parseInt(numeroBinario, 2);
            numeroOctal = Integer.toOctalString(numeroDecimal);
            numeroHexadecimal = Integer.toHexString(numeroDecimal);

            System.out.println("Binário: " + numeroBinario);
            System.out.println("Decimal: " + numeroDecimal);
            System.out.println("Octal: " + numeroOctal);
            System.out.println("Hexadecimal: " + numeroHexadecimal);

            numeroOctal = "75";

            numeroDecimal = Integer.parseInt(numeroOctal, 8);
            numeroBinario = Integer.toBinaryString(numeroDecimal);
            numeroHexadecimal = Integer.toHexString(numeroDecimal);

            System.out.println("Octal: " + numeroOctal);
            System.out.println("Decimal: " + numeroDecimal);
            System.out.println("Binário: " + numeroBinario);
            System.out.println("Hexadecimal: " + numeroHexadecimal);

            String hexadecimalNumber = "2F";

            numeroDecimal = Integer.parseInt(numeroHexadecimal, 16);
            numeroBinario = Integer.toBinaryString(numeroDecimal);
            numeroOctal = Integer.toOctalString(numeroDecimal);

            System.out.println("Hexadecimal: " + numeroHexadecimal);
            System.out.println("Decimal: " + numeroDecimal);
            System.out.println("Binário: " + numeroBinario);
            System.out.println("Octal: " + numeroOctal);

            //Caso 2
            String numeroQuinario= "1234"; // Exemplo de número quinário

            // Convertendo para Duodecimal
            numeroDecimal = Integer.parseInt(numeroQuinario, 5);
            String numeroDuodecimal = Integer.toString(numeroDecimal, 12);

            // Convertendo para Vigesimal
            String numeroVigesimal = Integer.toString(numeroDecimal, 20);

            // Convertendo para Sexagesimal
            String numeroSexagesimal = Integer.toString(numeroDecimal, 60);

            System.out.println("Quinário: " + numeroQuinario);
            System.out.println("Duodecimal: " + numeroDuodecimal);
            System.out.println("Vigesimal: " + numeroVigesimal);
            System.out.println("Sexagesimal: " + numeroSexagesimal);

    }
}
