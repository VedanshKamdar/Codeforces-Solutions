import java.util.Scanner;

public class interesting_drink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int j;
        int [] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int [] arr1=new int[m];
        for(j=0;j<m;j++)
        {
            arr1[j]=sc.nextInt();
        }
        
        {
            c=0;
            for(j=0;j<m;j++)
            {
                
            for(int i=0;i<n;i++)
            {
                if(arr1[j]<=arr[i])
                c++;
            }
            
            
        }
        System.out.println(c);
    }
        sc.close();
    }
}
