public class Livros extends Produtos{
    public String autor;
    public Livros(String nome, double preco,String autor) {
        super(nome, preco);
        this.autor=autor;
    }
    @Override
    public String toString(){
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco + ", autor: " + autor +
                '}';
    }
}
