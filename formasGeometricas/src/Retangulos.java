public class Retangulos extends Quadrilateros implements FormaGeometrica{
    int base,altura;

    public Retangulos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularPerimetro() {
        perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

    @Override
    public int calcularArea() {
        int area = base * altura;
        return area;
    }
}
