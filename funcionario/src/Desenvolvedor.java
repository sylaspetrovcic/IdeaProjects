import java.time.LocalDate;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, LocalDate dataDeNascimento,Double salario){
        super(nome,dataDeNascimento,salario);
    }
    @Override
    public Double calcularBonus(){
        return getSalario() * 4;
    }
}
