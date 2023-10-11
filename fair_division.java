import java.util.Scanner;

public class fair_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = 0;
            int b = 0;
            for (int i = 0; i < n; i++) {
                int w = sc.nextInt();
                if (w == 1) {
                    a++;
                } else {
                    b++;
                }
            }
            if (a % 2 == 0 && (b % 2 == 0 || a > 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
