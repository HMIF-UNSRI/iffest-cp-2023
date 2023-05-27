package hmif.babak_penyisihan;

public class EgimxPairedBarbell {
    public static int solution(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += arr[i] / 2;
            arr[i] = arr[i] % 2;
            if (i < n - 1) {
                arr[i + 1] += arr[i];
            }
        }
        return count;
    }
}