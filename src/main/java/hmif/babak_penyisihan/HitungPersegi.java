package hmif.babak_penyisihan;

public class HitungPersegi {
    public static int solution(int P, int Q) {
        int totalKotak = 0;
        for (int i = 1; i <= P; i++) {
            for (int j = 1; j <= Q; j++) {
                int ukuranKotak = Math.min(P - i + 1, Q - j + 1);
                totalKotak += ukuranKotak;
            }
        }
        return totalKotak;
    }
}
