public class TestePagamento {
    public static void main(String[] args) {
        Pagamento cartao = new Pagamento(200.50);
        Pagamento boleto = new Pagamento(35.00);
        cartao.calcularPagamento(200.50);
    }
}
