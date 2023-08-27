import java.util.Scanner;

public class dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        
        // Read input
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp1 = arr1[j];
                    int temp2 = arr2[j];
                    arr1[j] = arr1[j + 1];
                    arr2[j] = arr2[j + 1];
                    arr1[j + 1] = temp1;
                    arr2[j + 1] = temp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (s > arr1[i]) {
                s += arr2[i];
            } else {
                System.out.println("NO");
                sc.close();
                return;
            }
        }
        System.out.println("YES");
        sc.close();
    }
}
