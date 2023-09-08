import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] g = new int[5]; 
        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            g[size]++;
        }
        int t = g[4]; 
        t += g[3];
        g[1] -= g[3]; 
        
        if (g[1] < 0) {
            g[1] = 0; 
        }
        
        t += (g[2] * 2 + g[1] + 3) / 4; 
        
        System.out.println(t);
        sc.close();
    }
}
