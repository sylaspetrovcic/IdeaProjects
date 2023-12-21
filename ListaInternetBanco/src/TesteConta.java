public class TesteConta {
    public static void main(String[] args) {
        ClienteComum comum = new ClienteComum(200.00);
        comum.deposito(35.50);
        System.out.printf("Saldo = R$ %.2f ",comum.getSaldo());
        comum.retirada(35.00);
        System.out.printf("\nApós retirada saldo = %.2f R$ " , comum.getSaldo());
        ClienteEspecial especial = new ClienteEspecial(200.00);
        especial.deposito(35.50);
        System.out.printf("\nSaldo = R$ %.2f ",especial.getSaldo());
        especial.retirada(35.00);
        System.out.printf("\nApós retirada saldo = R$ %.2f" , especial.getSaldo());

    }
}
