
public class Conta {
    String numeroDaConta;
    float saldo;

    public Conta(String numeroDaContaconta, Float saldoInicial){
        this.numeroDaConta = numeroDaContaconta;
        this.saldo = saldoInicial;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void saque( float valor){
        if (saldo >0 && saldo >= valor){
        saldo -=  valor;
        System.out.println("Saldo atual é :" + saldo);
        System.out.println("Saque realizado com sucesso");
            }else {
            System.out.println("Saldo insuficiente");
        }
           }
    public void deposito(float v) {
        saldo = saldo + v;
        System.out.println(" o saldo atual é : " + saldo);
        System.out.println("Deposito realizado com sucesso");
    }
    }
