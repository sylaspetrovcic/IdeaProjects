public class ClienteComum extends ContaCorrente{
    public  double saque;
    public ClienteComum(double saldo){
        super(saldo);
    }

    @Override
    public void retirada(double saque) {
        //double desconto = taxa * saque;
        double desconto;
        if(saldo < saque){
            System.out.println("Saldo insuficiente");
        }else{
            desconto = (0.5/100) * saque;
            saldo = saldo - saque - desconto;
        }
    }


}
