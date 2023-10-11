import java.util.Scanner;

public class short_short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[t];
        
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextLine().toLowerCase();
            if (arr[i].equals("abc") || arr[i].equals("acb") || arr[i].equals("bac") || arr[i].equals("cba")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
