public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Paulo","Silva",1400.00);
        Empregado empregado1 = new Empregado("José","Carvalho",1555.34);
        double salarioAnual = empregado.getSalarioMensal() * 12;
        double salarioAnual1 = empregado1.getSalarioMensal() * 12;
        System.out.printf("Salario anual do Paulo = R$ %.2f" , salarioAnual);
        System.out.printf("\nSalario anual do José = R$ %.2f" , salarioAnual1);
        salarioAnual *=1.10;
        salarioAnual1 *= 1.10;
        System.out.printf("\nSalario anual do Paulo = R$ %.2f" , salarioAnual);
        System.out.printf("\nSalario anual do José = R$ %.2f" , salarioAnual1);

    }
}
