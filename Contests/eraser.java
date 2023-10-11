import java.util.Scanner;

public class eraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt(); // Length of the paper
            int k = sc.nextInt(); // Integer used in the operation
            sc.nextLine(); // Consume the newline character
            
            String s = sc.nextLine(); // Paper strip
            
            int operations = 0;
            int blackCount = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    blackCount++;
                }
                
                // If we have k consecutive black cells or we reach the end, perform an operation
                if ((i == n - 1 || s.charAt(i) == 'W') && blackCount > 0) {
                    operations++;
                    blackCount = 0;
                }
            }
            
            System.out.println(operations);
        }
        
        sc.close();
    }
}
