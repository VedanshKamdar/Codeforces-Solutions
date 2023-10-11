import java.util.Scanner;

public class good_kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); 
            }
            
            int x = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[x]) {
                    x = i;
                }
            }
            
            arr[x]++;
            long max = 1;
            for (int digit : arr) {
                max=max*digit;
            }
            
            System.out.println(max);
        }
        
        sc.close();
    }
}
