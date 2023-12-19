import java.util.ArrayList;
import java.util.List;

class Estacionamento {
        Estacionamento estacionamento = new Estacionamento();
    private final List<Veiculo> veiculosEstacionados = new ArrayList<>();

    public void estacionar(Veiculo v) {
        veiculosEstacionados.add(v);
    }
    public Veiculo sairDoEstacionamento(String placa){
        for( Veiculo veiculo: veiculosEstacionados){
            if(veiculo.placa.equals(placa)){
                veiculosEstacionados.remove(veiculo);
                return veiculo;
            }
        }
        return null;

    }
    public boolean ConsultarVeiculo(String placa){
        for(Veiculo veiculo : veiculosEstacionados){
            if(veiculo.placa.equals(placa)){
                return true;
            }
        }
        return false;
    }
    public int ocupacao(){
        return veiculosEstacionados.size();
    }

}
