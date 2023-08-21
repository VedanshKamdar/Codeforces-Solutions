import java.util.Arrays;
import java.util.Scanner;

public class increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        for(int i=1;i<=t;i++)
        {
            
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            c=0;
            for(int k=0;k<n-1;k++)
            {
                if(arr[k]>=arr[k+1])
                c++;
            }
            if(c>0)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
        sc.close();
    }
    
}
