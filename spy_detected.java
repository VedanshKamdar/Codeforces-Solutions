import java.util.Scanner;
public class spy_detected
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int j=0;i<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<n-2;j++)
            {
                if(arr[j]!=arr[j+1])
                {
                    if(arr[j+1]!=arr[j+2])
                    System.out.println(j+1);
                    else
                    System.out.println(j);
                }
            }
        }
    }
}