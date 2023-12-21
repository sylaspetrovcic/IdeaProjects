import java.util.Scanner;

public class Tabela {
    public static void main(String[] args) {
        System.out.println("Qual o valor do empréstimo");
        Scanner leitor = new Scanner(System.in);
        System.out.print(">");
        double valor = leitor.nextDouble();
        System.out.println("Informe a taxa de juros ao mes do empréstimo");
        System.out.print(">");
        double taxa = leitor.nextDouble();
        System.out.println("Informe o tempo para pagamento em meses");
        System.out.print(">");
        int tempo = leitor.nextInt();
        double amortizacao = valor / tempo;
        double jurosMensal = valor * taxa;
        double parcelaMensal = jurosMensal + amortizacao;
        double valorAtual = valor - amortizacao;
        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor R$ %.2f," +
                "com juros de %.1f %% ao mes\n ",amortizacao,valor,taxa*100);
        for(int i =1;i<=12;i++){
            System.out.printf("Parcela %d  | Juros R$ %.2f  | Prestação R$ %.2f  | Saldo devedor R$ %.2f \n" ,
                    i ,jurosMensal , parcelaMensal ,valorAtual );
            amortizacao = valorAtual/(tempo - i);
            jurosMensal = valorAtual*taxa;
            parcelaMensal = jurosMensal + amortizacao;
            valorAtual = valorAtual - amortizacao;
        }
    }
}
