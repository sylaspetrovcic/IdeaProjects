import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    public Usuario(String nome, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }
    }

