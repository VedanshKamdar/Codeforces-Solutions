import java.util.Arrays;
import java.util.Scanner;

public class twin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        Arrays.sort(arr);
        int t=0;
        int c=0;
        for (int i = n - 1; i >= 0; i--) {
            c=c+ arr[i];
            t++;
            if (c >= t / 2) {
                break;
            }
        }
        System.out.println(t);
        sc.close();
    }
}