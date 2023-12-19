public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(double valor) {
        super(valor);
    }

    void calcularPagamento(double valor){
        System.out.println("Pagando o cartão de crédito" + this.valor);
    }
}
