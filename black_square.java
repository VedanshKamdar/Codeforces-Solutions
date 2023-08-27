import java.util.Scanner;

public class black_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i); 
            if (ch == '1')
                sum += a1;
            else if (ch == '2')
                sum += a2;
            else if (ch == '3')
                sum += a3;
            else
                sum += a4;
        }
        System.out.println(sum);
        sc.close();
    }
}
