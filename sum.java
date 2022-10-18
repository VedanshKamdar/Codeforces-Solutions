import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] arr=new int[3];
        for(int i=1;i<=t;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[j]=sc.nextInt();
            }
            if(arr[0]==arr[1]+arr[2] || arr[1]==arr[0]+arr[2] || arr[2]==arr[1]+arr[0])
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }
}
