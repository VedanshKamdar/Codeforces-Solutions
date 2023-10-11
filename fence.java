import java.util.Scanner;

public class fence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = s.nextInt();
        }

        int m = Integer.MAX_VALUE;
        int mi = 0;
        int c = 0;

        for (int i = 0; i < k; i++) {
            c += h[i];
        }

        m = c;

        for (int i = k; i < n; i++) {
            c += h[i] - h[i - k];
            if (c < m) {
                m = c;
                mi = i - k + 1;
            }
        }

        System.out.println(mi + 1);

        s.close();
    }
}
