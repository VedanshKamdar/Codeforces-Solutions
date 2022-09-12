import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int [] arr=new int[n];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
            count=count+arr[i];
        }
        int a=count/4;
        if(count%4!=0)
        System.out.println(a+1);
        else
        System.out.println(a);
        sc.close();
    }
}
