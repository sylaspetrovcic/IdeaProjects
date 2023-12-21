public class Televisor {
    int canal;
    int volume;
    String s;
    boolean ligado = false;

    int aumentarVolume() {
        if (volume <= 10) {
            volume++;
        }
        else {
            System.out.println("O volume já está no máximo");
            volume--;
        }
        return volume;
    }

    int subirCanal() {
        if (canal <= 16) {
            canal++;
        }
        else {
            System.out.println("Os canais já chegaram no final");
            canal--;
        }
        return canal;
    }

    int diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
        else{
            System.out.println("O volume já está no mínimo");
            volume++;
        }
        return volume;
    }
    int descerCanal(){
        if(canal>1){
            canal--;
        }
        else {
            System.out.println("O canal já atingiu o menor canal");
        }
        return canal;
    }
    String ligarTelevisao() {
        ligado = true;
        s = "Ligado";
       return s;

    }
    String desligarTelevisao(){
        ligado = false;
        s = "desligado";
        return s;

    }
    boolean mostrarStatus(){
        return ligado;
    }
}
