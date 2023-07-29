import java.util.Scanner;

public class codeforces_checking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine();

        String s = "codeforces";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            char ch = scanner.nextLine().charAt(0);
            boolean isPresent = s.indexOf(ch) != -1;
            if (isPresent) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }
        scanner.close();
        System.out.print(output);
    }
}
