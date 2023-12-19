import java.text.Normalizer;
import java.util.regex.Pattern;

public class Principal {
    public static <Equals> void main(String[] args) {
        String palavra01 = "Leão-Marinho";
        String[] a = palavra01. split("-");
        System.out.println(a[0] + "+" +a[1]);
        System.out.println(a[1]);
        if (palavra01.equals(a) ){
            System.out.println("sao iguais");
        }else{
            System.out.println("São diferentes");
        }
        System.out.println(a[0].concat(a[1]));
        String palavra03 = palavra01.toLowerCase();
        System.out.println(palavra03);
         String palavra04 = trim(palavra01);
        System.out.println(palavra04);
        System.out.println(palavra01.length());
        int j = palavra01.lastIndexOf("i");
        System.out.println(j);
        palavra01 = deAccent(palavra01);
        System.out.println(palavra01);
    }

    private static String trim(String palavra01) {
        return palavra01;
    }


    public static String deAccent(String str) {
        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}
