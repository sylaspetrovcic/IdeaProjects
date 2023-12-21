public class TestaConta {
    public static void main(String[] args) {


        Conta banco = new Conta("123", 250.00f);
        System.out.println("Conta número : " + banco.getNumeroDaConta());
        System.out.println("Saldo inicial : " + banco.getSaldo());
        banco.saque(100.30f);
        banco.deposito(300.55f);

    }
}