import java.util.Scanner;

public class helpful_maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = (st.length() + 1) / 2;
        int temp = 0;
        int[] arr = new int[n];

        for (int i = 0; i < st.length(); i = i + 2) {
            arr[i / 2] = st.charAt(i) - '0'; 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print("+");
            }
        }
        
        sc.close();
    }
}
