import java.util.Scanner;

public class kth_1352C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int result = k + (k - 1) / (n - 1);
            System.out.println(result);
        }
        sc.close();
    }
}
