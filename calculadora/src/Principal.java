import org.w3c.dom.ls.LSOutput;

public class Principal{
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        int soma = x + y;
        int subtracao = x - y ;
        int mult = x * y;
        int div = x / y;
        System.out.println("Soma de " + x + "+ " + y + " = " + soma);
        System.out.println("Subtraçãode " +x + " - " + y + " = " + subtracao);
        System.out.println("Multiplicação de "+ x + " x " + y + " = " + mult);
        System.out.println("Divisão de " +x + " / " + y + " = " + div);
    }

}
