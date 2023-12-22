import java.util.LinkedList;

public class ExemploListaEncadeada {
    public static void main(String[] args) {
        LinkedList<String>exemplo = new LinkedList<>();
        exemplo.add("Estou estudando listas encadeadas");
        exemplo.add("Exemplos");
        exemplo.add("Lista encadeada");
        System.out.println(exemplo);
        exemplo.remove(2);
        System.out.println(exemplo);
        exemplo.add(1,"Incluindo uma String no index 1");
        System.out.println(exemplo);
        exemplo.remove(2);
        System.out.println(exemplo);

    }
}
