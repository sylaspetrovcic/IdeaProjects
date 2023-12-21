import java.util.Arrays;

public class Vetor {
    static int[] numeros = new int[0];
    public void localizarMaior(int[] valores) {
        int maior = valores[0];

        for (int i = 0; i < 6; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        System.out.println(Arrays.toString(valores));
        System.out.println("O maior é : " + maior);
    }
    public void localizarMenor(int[] valores) {
        int menor = valores[0];
        for (int i = 0; i < 6; i++) {
            if (valores[i] < valores[0]) {
                menor = valores[i];
            }
        }
        System.out.println("O menor é : " + menor);
    }
    public void media(int[] valores){
        int media = 0;
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
            }
        System.out.println("A soma é : " + soma);
        media = soma/valores.length;
        System.out.println("A média é :" + media);
    }
}