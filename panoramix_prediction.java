import java.util.Scanner;

public class panoramix_prediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int nextPrime = firstNumber + 1;
        while (true) {
            boolean isPrime = true;
            for (int i = 2; i * i <= nextPrime; i++) {
                if (nextPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                break;
            }
            nextPrime++;
        }
        if (secondNumber == nextPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
