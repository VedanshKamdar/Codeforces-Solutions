import java.util.Scanner;
public class police_recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input, sum = 0, neg = 0;
        for (int i = 0; i < n; i++) {
            input = sc.nextInt();
            if (input > 0) {
                sum+=input;
            } else if (input < 0) {
                if (sum > 0) {
                    sum--;
                } else {
                    neg++;
                }
            }
        }
        System.out.println(neg);
        sc.close();
    }
}