import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Length of the sequence
            int[] a = new int[n];  // Sequence a

            // Read sequence a
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Find and print the minimum value of bn for the current test case
            int result = findMinimumBn(n, a);
            System.out.println(result);
        }
    }

    // Function to find the minimum value of bn among all good sequences
    public static int findMinimumBn(int n, int[] a) {
        int minB = 1;  // Initialize minB to 1

        for (int ai : a) {
            int bi = Math.max(ai + 1, minB + 1);
            minB = bi;
        }

        return minB;
    }
}
