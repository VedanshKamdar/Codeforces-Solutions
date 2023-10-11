import java.util.Scanner;

public class square_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int n = s.length();
            boolean flag = true;

            if (n % 2 == 0) {
                for (int j = 0; j < n / 2; j++) {
                    if (s.charAt(j) != s.charAt(n/2+j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
