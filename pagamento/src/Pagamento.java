public class Pagamento {
    protected double valor;
    public Pagamento(double valor){
        this.valor = valor;
    }
    public String calcularPagamento(double valor) {
        return "pago";
    }

}


