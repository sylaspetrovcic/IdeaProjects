import java.time.LocalDate;
import java.util.ArrayList;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Rodolfo", "rodolfo.lima@gmail.com",
                LocalDate.of(1994,3 ,26));

        OperacoesUsuario operacoesUsuario = new OperacoesUsuario();
        operacoesUsuario.salvarUsuarios(usuario);

        Usuario usuario1 = new Usuario("Sylas", "sylascp@gmail.com",
                LocalDate.of(1958,9,8));

        operacoesUsuario.salvarUsuarios(usuario1);

        Usuario usuario2 = new Usuario("Sylas", "sylascp@gmail.com",
                LocalDate.of(1958,9,8));

        operacoesUsuario.salvarUsuarios(usuario2);
        ArrayList<Usuario> usuariosSalvos = operacoesUsuario.getUsuariosDoBancoDeDados();
        for (Usuario item : usuariosSalvos) {
            System.out.println("Usuários salvos no banco de dados "+" " + item.getNome() +
                    " " + item.getEmail() + " " +item.getDataNascimento());
        }
    }
}
