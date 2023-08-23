import java.util.Scanner;

public class dislike_of_threes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int k = scanner.nextInt(); 
            int ans = find(k);
            System.out.println(ans);
        }
        
        scanner.close();
    }
    public static int find(int n) {
        int num = 1;
        while (n > 0) {
            if (num % 3 != 0 && num % 10 != 3) {
                n--;
            }
            num++;
        }
        return num - 1;
    }
}
