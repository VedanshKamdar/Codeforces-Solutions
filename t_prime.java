import java.util.Scanner;

public class t_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int count=0;
        long [] arr=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
            count=0;
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                count++;
            }
            if(count==3)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }
}
