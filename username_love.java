import java.util.Scanner;

public class username_love {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int [] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=1;i<n;i++)
        {
            if(n==2)
            {
            System.out.println("1");
            break;
            }
            else
            {
            if(arr[i]>arr[i-1])
            count++;
        }
        System.out.println(count);
    }
}
    }

