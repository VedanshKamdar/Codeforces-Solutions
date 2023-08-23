// 230A
import java.util.Arrays;
import java.util.Scanner;

public class dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(s>=arr1[i])
            {
                s=s+arr2[i];
                count++;
            }
            else
            count--;
            
        }
        if(count==n)
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}
