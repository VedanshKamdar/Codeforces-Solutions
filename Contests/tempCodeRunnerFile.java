import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the sequence
            int[] a = new int[n]; // Input sequence a
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            boolean[] used = new boolean[n + 1]; // To keep track of used values
            int minB = 1; // Initialize minimum b to 1
            
            for (int i = 0; i < n; i++) {
                if (a[i] < minB) {
                    continue; // Skip values less than minB
                }
                used[a[i]] = true;
                while (used[minB]) {
                    minB++;
                }
            }
            
            System.out.println(minB);
        }
        
        scanner.close();
    }
}
