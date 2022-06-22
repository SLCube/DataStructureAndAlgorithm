package chap02;

public class Copy {
    public static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;

        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }
}
