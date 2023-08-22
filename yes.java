import java.util.Scanner;

public class yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        String arr[] = new String[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toUpperCase().equals("YES"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
