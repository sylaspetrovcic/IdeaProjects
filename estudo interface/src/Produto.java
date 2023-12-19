public  class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto produto) {
        int resultado =0;
        if (preco > produto.getPreco()){
            {
                resultado = 1;
            }
            if(preco == produto.getPreco()){
                resultado = 0;
            }
            if (preco < produto.getPreco()){
                resultado =  -1;
            }

        }
        return resultado;


    }

    public String getNome() {
        return nome;
    }
}
