import java.util.Random;

public class Cartelas {
    Random random = new Random();
    int x;
    public Cartelas(int i) {
        int[] cartelas = new int[6];

            for (int a = 0; a <cartelas.length ; a++) {
                x = random.nextInt(60);
                if (x != 0) {
                    cartelas[a] = x;
                }
            }
        }
    }

