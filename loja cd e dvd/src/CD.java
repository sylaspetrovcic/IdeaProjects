public class CD extends Produtos{
    int numFaixas;
    public CD(String nome, double preco,int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }
    @Override
    public String toString(){
        return "CD{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco + ", número de faixas: " + numFaixas +
                '}';
    }
}
