public class puzzles {
    public static void main(String[] args) {
        int n, m;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) a[i] = sc.nextInt();
        sc.close();
        java.util.Arrays.sort(a);
        int minDiff = a[n - 1] - a[0];
        for (int i = 1; i <= m - n; i++) {
            int diff = a[i + n - 1] - a[i];
            if (diff < minDiff) minDiff = diff;
        }
        System.out.println(minDiff);
    }
}
