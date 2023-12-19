import java.time.LocalDate;

public abstract class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private Double salario;

    public Funcionario(String nome, LocalDate dataNascimento, Double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    public String apresentar() {
        return "Olá meu nome é " + this.nome + " e eu nasci em " + this.dataNascimento;
    }

    public Double getSalario(){
        return salario;
    }
    public String getNome(){
        return nome;
    }

    public abstract Double calcularBonus();
}
