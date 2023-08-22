import java.util.Scanner;

public class sereja_and_dima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        int serejaScore = 0;
        int dimaScore = 0;
        int left = 0;
        int right = n - 1;
        boolean serejaTurn = true;
        while (left <= right) {
            int maxCard = Math.max(cards[left], cards[right]);
            if (serejaTurn) {
                serejaScore += maxCard;
            } else {
                dimaScore += maxCard;
            }
            if (maxCard == cards[left]) {
                left++;
            } else {
                right--;
            }
            serejaTurn = !serejaTurn;
        }
        System.out.println(serejaScore + " " + dimaScore);
        scanner.close();
    }
}
