import java.util.Scanner;
public class candies_and_two_sisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] arr=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<t;j++)
        {
            if(arr[j]%2==0)
            System.out.println((arr[j]/2)-1);
            else
            {
                System.out.println(arr[j]/2);
            }
        }
        sc.close();
    }
}
