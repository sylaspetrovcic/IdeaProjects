
import java.util.ArrayList;
import java.util.List;
class Estacionamento{
private final List<Veiculo> veiculosEstacionados;

public Estacionamento() {
    this.veiculosEstacionados = new ArrayList<>();
}
public void estacionarVeiculo( Veiculo v){
    veiculosEstacionados.add(v);
}
public Veiculo sairDoEstacionamento(String placa){
    for(Veiculo veiculo : veiculosEstacionados){
        if(veiculo.placa.equals(placa)){
            veiculosEstacionados.remove(veiculo);
            return veiculo;
        }
    }
    return null;
}
public boolean consultarVeiculo(String placa){
    for(Veiculo veiculo : veiculosEstacionados){
        if(veiculo.placa.equals(placa)){
            return true;
        }
    }
    return false;
}
    public int ocupacao() {
        return veiculosEstacionados.size();
    }
}
