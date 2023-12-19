import java.util.ArrayList;
public class OperacoesUsuario {
    ArrayList<Usuario> usuariosDoBancoDeDados;
    public OperacoesUsuario(){
        this.usuariosDoBancoDeDados = new ArrayList<>();
    }
    public void salvarUsuarios(Usuario usuario) {
        boolean emailJaExistente = false;
        for (Usuario u : usuariosDoBancoDeDados) {
            if (u.getEmail().equals(usuario.getEmail())) {
                emailJaExistente = true;
                break;
            }
        }

        if (!emailJaExistente) {
            usuariosDoBancoDeDados.add(usuario);
            System.out.println("Usuário salvo no banco de dados: " + usuario.getNome());
        } else {
            System.out.println("Erro: Este email já está sendo usado por outro usuário.");
        }
    }
    public ArrayList<Usuario> getUsuariosDoBancoDeDados() {
        return usuariosDoBancoDeDados;
    }
}
