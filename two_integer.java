// yet another two integer problem - 1409A

import java.util.Scanner;

public class two_integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int diff = Math.abs(a - b);
            int moves = (diff + 9) / 10; 
            
            System.out.println(moves);
        }
        
        scanner.close();
    }
}
