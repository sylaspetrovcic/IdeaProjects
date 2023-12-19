import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        String[] vet={"a","b","c","e","f","g","h","i","j","l","m"};
        System.out.println(vet.length);
        int qteCons =0;

        for( int i =0; i<=10;i++){
            if (vet[i] != ("a") && vet[i] != "b" && vet[i] != "e" && vet[i] != "i" && vet[i]  != "o"
                   && vet[i] != "u"){

                qteCons= qteCons + 1;
            }
            System.out.printf("As consoantes são : %s, \n",vet[i]);
                 }

        System.out.println("A quantidade de consoantes é : " + qteCons);

    }
}
