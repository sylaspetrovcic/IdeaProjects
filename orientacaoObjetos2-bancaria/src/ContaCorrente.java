public class ContaCorrente extends ContaBancaria {
    public boolean possuiChequeEspecial;
    public double limiteDoChequeEspecial;


    public ContaCorrente(String agencia, String conta, boolean possuiChequeEspecial) {
        this.agencia = agencia;
        this.conta = conta;
        if (possuiChequeEspecial) {
            this.limiteDoChequeEspecial = 500;
        } else {
            this.limiteDoChequeEspecial = 0;
        }
        this.possuiChequeEspecial = possuiChequeEspecial;


    }

    public void setLimiteDoChequeEspecial(double novoLimite) {
        if (possuiChequeEspecial) {
            limiteDoChequeEspecial = novoLimite;
        }
    }
}