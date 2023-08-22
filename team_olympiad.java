import java.util.ArrayList;
import java.util.Scanner;

public class team_olympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        ArrayList<Integer> programming = new ArrayList<>();
        ArrayList<Integer> math = new ArrayList<>();
        ArrayList<Integer> pe = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int skill = scanner.nextInt();
            if (skill == 1) {
                programming.add(i);
            } else if (skill == 2) {
                math.add(i);
            } else {
                pe.add(i);
            }
        }

        int teams = Math.min(Math.min(programming.size(), math.size()), pe.size());

        System.out.println(teams);
        for (int i = 0; i < teams; i++) {
            System.out.println(programming.get(i) + " " + math.get(i) + " " + pe.get(i));
        }

        scanner.close();
    }
}
