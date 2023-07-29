import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class beautiful_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        int nextYear = y + 1;
        while (!hasDistinctDigits(nextYear)) {
            nextYear++;
        }

        System.out.println(nextYear);

        scanner.close();
    }

    private static boolean hasDistinctDigits(int year) {
        Set<Integer> digits = new HashSet<>();
        while (year > 0) {
            int digit = year % 10;
            if (digits.contains(digit)) {
                return false;
            }
            digits.add(digit);
            year /= 10;
        }
        return true;
    }
}
