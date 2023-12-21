public class DVD extends Produtos{
    public int duracao;
    public DVD(String nome, double preco,int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }
    @Override
    public String toString(){
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco + ", duração: " + duracao +
                '}';
    }
}
