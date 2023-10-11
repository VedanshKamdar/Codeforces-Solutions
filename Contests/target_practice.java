import java.util.Scanner;

public class target_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        for (int testCase = 0; testCase < t; testCase++) {
            int totalPoints = 0;
            
            for (int i = 0; i < 10; i++) {
                String row = scanner.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (row.charAt(j) == 'X') {
                        int distanceSquared = (i - 4) * (i - 4) + (j - 4) * (j - 4);
                        int points = 0;
                        
                        if (distanceSquared == 0) {
                            points = 5;
                        } else if (distanceSquared <= 2 * 2) {
                            points = 4;
                        } else if (distanceSquared <= 4 * 4) {
                            points = 3;
                        } else if (distanceSquared <= 6 * 6) {
                            points = 2;
                        } else if (distanceSquared <= 8 * 8) {
                            points = 1;
                        }
                        
                        totalPoints += points;
                    }
                }
            }
            
            System.out.println(totalPoints);
        }
    }
}
