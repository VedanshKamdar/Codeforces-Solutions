import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int maxGCD = n / 2;

            System.out.println(maxGCD);
        }

        sc.close();
    }
}
