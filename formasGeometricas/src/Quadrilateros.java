public abstract class Quadrilateros implements FormaGeometrica {
    int l1,l2,l3,l4;
    int perimetro;

    @Override
    public int calcularPerimetro() {
        return l1 + l2 + l3 + l4;
    }

    @Override
    public int calcularArea() {
        return 0;
    }
}

