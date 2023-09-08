import java.util.Scanner;

public class two_vessels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr1[]=new int[t];
        int arr2[]=new int[t];
        int arr3[]=new int[t];
        double sum=0;
        double sum1=0;
        for(int i=0;i<t;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            arr3[i]=sc.nextInt();
            sum=Math.max(arr1[i], arr2[i])-((arr1[i]+arr2[i])/2); 
            sum1=sum/arr3[i];
            if(sum1==0)
            {
                if(sum==0)
                System.out.println(0);
                else
                System.out.println(1);
            }
            else
            System.out.println((int)Math.ceil(sum1));
        }
        sc.close();
    }
}
