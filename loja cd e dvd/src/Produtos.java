public class Produtos {
    public String nome;
    public double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

   // @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
