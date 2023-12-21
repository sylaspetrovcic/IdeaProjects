public abstract class ContaCorrente {
    public double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
            }

    public void deposito(double deposito){
        saldo = saldo + deposito;

    }
    public abstract void retirada(double saque);
    public double getSaldo(){
        return this.saldo;
    }


    }

