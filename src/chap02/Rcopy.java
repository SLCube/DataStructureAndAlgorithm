package chap02;

public class Rcopy {
    public static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
    }
}
