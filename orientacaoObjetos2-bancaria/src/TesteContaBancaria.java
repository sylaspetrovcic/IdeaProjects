public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Centro","204-1",true);
        contaCorrente.setLimiteDoChequeEspecial(500);
        System.out.println(contaCorrente.toString());
    }
}
