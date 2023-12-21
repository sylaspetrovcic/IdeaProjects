public class TesteVetor {
    public static void main(String[] args) {
        Vetor numeros = new Vetor();
        Vetor.numeros = new int[]{2, 4, 3, 8, 7, 6};
        numeros.localizarMaior(Vetor.numeros);
        numeros.localizarMenor(Vetor.numeros);
        numeros.media(Vetor.numeros);


    }
}