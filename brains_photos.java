import java.util.Scanner;

public class brains_photos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); 
        
        boolean isColored = false;
        
        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            if (row.contains("C") || row.contains("M") || row.contains("Y")) {
                isColored = true;
                break;
            }
        }

        if (isColored) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
        
        sc.close();
    }
}
