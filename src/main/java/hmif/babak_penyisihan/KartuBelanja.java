package hmif.babak_penyisihan;

import java.util.Arrays;

public class KartuBelanja {
    public static String solution(int p, int n) {
        int paid = 0, free = 0;
        while (n > 0) {
            if (p < 5) {
                n--;
                p++;
                paid++;
            } else {
                n--;
                p -= 5;
                free++;
            }
        }

        int[] result = { paid, free, p };

        return Arrays.toString(result);
    }
}
