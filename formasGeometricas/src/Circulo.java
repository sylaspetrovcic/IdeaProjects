public class Circulo implements FormaGeometrica{
    int r;
    public Circulo(int r){
        this.r = r;
    }

    @Override
    public int calcularPerimetro() {

        return (int) (2 * Math.PI * r);
    }

    @Override
    public int calcularArea() {
        return (int) (Math.PI * r * r);
    }
}
