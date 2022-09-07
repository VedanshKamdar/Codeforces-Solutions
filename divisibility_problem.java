import java.util.Scanner;
public class divisibility_problem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=1;
        
        int [] arr1=new int[t];
        int [] arr2=new int[t];
        for(int i=0;i<t;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        for(int j=0;j<t;j++)
        {
            int c=0;
            if(arr1[j]%arr2[j]==0)
            System.out.println("0");
            else
            {
                c=arr1[j]/arr2[j];
                c=c+1;
                int b=arr2[j]*c;
                int ans=b-arr1[j];
                System.out.println(ans);
            }
        }
    }
}