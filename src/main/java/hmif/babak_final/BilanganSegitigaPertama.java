package hmif.babak_final;

public class BilanganSegitigaPertama {
    public static int solution(int m) {
        int i = 1;
        while (true) {
            if (numFactors(firstTriangular(i)) > m) {
                return firstTriangular(i);
            }
            i++;
        }
    }

    public static int firstTriangular(int n) {
        return (n * (n + 1) / 2);
    }

    public static int numFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
