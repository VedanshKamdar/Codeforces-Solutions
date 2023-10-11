import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int result = s.charAt(0) - '0' + s.charAt(2) - '0';
            System.out.println(result);
        }

        sc.close();
    }
}
