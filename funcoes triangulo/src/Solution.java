    public class Solution {
        public static boolean eUmTriangulo(int[] input) {


            if (input[1] + input[2]>input[0] && input[0] + input[2]>input[1] && input[0] + input[1]>input[2])
            {
                System.out.println("Trata-se de um triangulo");
                return true;
            } else {
                System.out.println("Não é de um triangulo");
                return false;
            }
        }
        public static void main(String[] args) {
            int x = 3, y = 3, z = 3;
            int[] input = new int[]{x, y, z};
             boolean a =eUmTriangulo( input);
            System.out.println(a);

        }
    }





