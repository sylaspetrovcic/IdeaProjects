public class Quadrado extends Quadrilateros implements FormaGeometrica{
    int l;
    public Quadrado(int l){
        super();
        //this.l = l;
    }

    @Override
    public int calcularPerimetro() {
        perimetro = 4 * l;
        return perimetro;
    }

    @Override
    public int calcularArea() {
        int area = l * l;
        return area;
    }
}
