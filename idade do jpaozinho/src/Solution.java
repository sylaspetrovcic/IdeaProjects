public class Solution {
    public static int idadeEmDias(int[] input) {
        int dias = input[0]*365 + input[1]*30 + input[2];
        return dias;
    }

    public static void main(String[] args) {
        //int anos,meses,dias;
        int[] input = new int[]{5, 4, 14};
        int dias =idadeEmDias(input);
        System.out.println(dias);
    }
}
