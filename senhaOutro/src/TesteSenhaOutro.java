public class TesteSenhaOutro {
    public static void main(String[] args) {
        Senha usuario = new Senha("senha1");
        System.out.println(usuario.modifySenha("senha123"));
        System.out.println(usuario.modifySenha("senha123")); // Senha alterada com sucesso
        System.out.println(usuario.modifySenha("outraSenha456")); // Senha alterada com sucesso
        System.out.println(usuario.modifySenha("senha123")); // Senha não pode ser igual às três últimas utilizadas
        System.out.println(usuario.modifySenha("maisUmaSenha789")); // Senha alterada com sucesso


    }
    }

