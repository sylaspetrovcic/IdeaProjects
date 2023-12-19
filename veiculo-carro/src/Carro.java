public class Carro extends Veiculo {
    private String tipoDeCombustivel;

    public Carro(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String ligar() {
        if (estaLigado) {
            return "carro já está ligado";
        } else {
            estaLigado = true;
            return "ligado";
        }
    }

    public String desligar() {
        if (!estaLigado) {
            return "carro já está desligado";
        } else {
            estaLigado = false;
            return "desligado";
        }
    }
}