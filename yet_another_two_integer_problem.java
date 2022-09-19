import java.util.Scanner;

public class yet_another_two_integer_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] arr1=new long[n];
        long [] arr2=new long[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextLong();
            arr2[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                if(Math.abs((arr1[i]-arr2[i])/10)==0)
                {
                System.out.println(Math.abs(arr1[i]-arr2[i])/10);
                }
                else
                {
                System.out.println((Math.abs(arr1[i]-arr2[i])/10)+1);
                }
            }
            else
            System.out.println("0");
        }
    }
}
