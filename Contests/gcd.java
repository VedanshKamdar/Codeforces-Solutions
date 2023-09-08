import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            if (2 * l <= r) {
                System.out.println(l + " " + (2 * l));
            } else {
                System.out.println("-1");
            }
        }
    }
}
