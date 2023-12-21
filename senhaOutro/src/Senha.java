import java.util.ArrayList;
import java.util.List;

public class Senha {
    private static List<String> senhas;

    public  Senha(String senha) {
        this.senhas = new ArrayList<>();

    }

    public String modifySenha(String novaSenhas) {
        if (senhas.contains(novaSenhas) && senhas.indexOf(novaSenhas) >= senhas.size() - 3) {
            return "Senha não pode ser igual às três últimas utilizadas";
        } else {
            senhas.add(novaSenhas);
            return "Senha alterada com sucesso";
        }
    }
}
