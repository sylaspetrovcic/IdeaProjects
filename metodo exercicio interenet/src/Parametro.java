public class Parametro {
        public int adicionaDois(int i){
            i = i+ 2;
            System.out.println("Valor de i " + i );
            return i;
        }
        public static void main (String[] args ){
            int i = 11;
            System.out.println("Valor inicial de i " + i );
            Parametro oParam = new Parametro();
            int j = oParam.adicionaDois(i);

            System.out.println("Valor de j " + j );
            System.out.println("Valor final de i " + i );
        }
    }

