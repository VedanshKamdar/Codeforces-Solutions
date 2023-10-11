import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            long k = 2;
            while (n % ((1L << k) - 1) != 0) {
                k++;
            }
            
            System.out.println(n / ((1L << k) - 1));
        }
        
        sc.close();
    }
}
