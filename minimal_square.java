import java.util.Scanner;

public class minimal_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int side = Math.min(Math.max(2 * a, b), Math.max(2 * b, a));
            int minimalSquareArea = side * side;
            System.out.println(minimalSquareArea);
        }
        sc.close();
    }
}
