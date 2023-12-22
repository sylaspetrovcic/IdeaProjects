public class Quadrado extends Quadrilateros {
    int lado;
    public Quadrado(int lado){
        super();
        this.lado = lado;
    }

    @Override
    public int calcularPerimetro() {
        perimetro = 4 * lado;
        return perimetro;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}
