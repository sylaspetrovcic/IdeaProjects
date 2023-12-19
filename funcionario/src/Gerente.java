import java.time.LocalDate;

public class Gerente extends Funcionario{
    public Gerente(String nome, LocalDate dataDeNascimento,Double salario){
        super(nome,dataDeNascimento,salario);
    }
    public Double calcularBonus(){
       return getSalario() * 3;
    }
}
