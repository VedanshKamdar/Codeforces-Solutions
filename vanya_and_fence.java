import java.util.Scanner;
public class vanya_and_fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int count=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>h)
            count=count+2;
            else
            count=count+1;
        }
        System.out.println(count);
        sc.close();
    }
}
