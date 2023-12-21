import java.lang.reflect.Array;

public class Loja {
    public static void main(String[] args) {
        String[] produtos = new String[5];
        Livros livros = new Livros("Incidente em Antares",230.00,"Érico Veríssimo");
        CD cd = new CD("Amigos",75.00,10);
        CD cd1 = new CD("Inimigos",38.49,11);
        DVD dvd = new DVD("Homem aranha",120.00,122);
        DVD dvd1 = new DVD("2012",150.00,120);
        produtos[0] = cd.nome;
        produtos[1]= cd1.nome;
        produtos[2] = livros.nome;
        produtos[3] = dvd1.nome;
        produtos[4] = dvd.nome;
        for (int i =0; i < produtos.length; i++){
            System.out.println(produtos[i]);

        }
        System.out.println(cd.toString());
        System.out.println(cd1.toString());
        System.out.println(livros.toString());
        System.out.println(dvd1.toString());
        System.out.println(dvd.toString());

    }
}
