public class ClienteEspecial extends ContaCorrente{
    public double saque;
    public ClienteEspecial(double saldo){
        super(saldo);
    }
    @Override
    public void retirada(double saque) {
     double desconto ;
        if (saldo < saque) {
            System.out.println("Saldo insuficiente");
        } else {
             desconto = (0.1/100) * saque;
            saldo = saldo - saque -desconto;
        }
    }
}
