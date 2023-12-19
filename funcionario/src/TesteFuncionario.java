import java.time.LocalDate;

public class TesteFuncionario {
    public static void main(String[] args) {


        Funcionario desenvolvedor = new Desenvolvedor("Jorge", LocalDate.of(1960, 2, 23),
                3000.00);
        Funcionario gerente = new Gerente("Abilio", LocalDate.of(1967, 5, 1),
                4500.00);
        System.out.println(gerente.calcularBonus());
        System.out.println(desenvolvedor.calcularBonus());
    }
}