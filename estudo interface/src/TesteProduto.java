
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Alface", 2.90);
        Produto produto1 = new Produto("Abacate", 3.4);
        Produto produto2 = new Produto("Banana", 1.23);
        Produto produto3 = new Produto("Feijão", 3.45);
        List<Produto> mercearia = new ArrayList<>();
        mercearia.add(produto1);
        mercearia.add(produto2);
        mercearia.add(produto3);
        mercearia.add(produto);
        Collections.sort(mercearia);

        for (Produto item : mercearia
        ) {
            System.out.println("Produto " + item.getNome() +" "+ item.getPreco());

        }
        @Override
        public int compareTo(Produto mercearia) {
            int resultado =0;
            if (mercearia.> produto.getPreco()){
                {
                    resultado = 1;
                }
                if(mercearia.preco == produto.getPreco()){
                    resultado = 0;
                }
                if (mercearia.preco < produto.getPreco()){
                    resultado =  -1;
                }

            }
            return resultado;


        }


    }
}

