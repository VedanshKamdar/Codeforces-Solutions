// 1692A
import java.util.Scanner;

public class marathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[4];
        int count=0;
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[j]=sc.nextInt();
                if(arr[j]>arr[0])
                count++;
            }
            System.out.println(count);
            count=0;
        }
        sc.close();
    }
}
