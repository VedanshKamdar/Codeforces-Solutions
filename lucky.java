// 1676A Lucky?
import java.util.Scanner;

public class lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String arr[]=new String[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.next();
            if((arr[i].charAt(0)+arr[i].charAt(1)+arr[i].charAt(2))==(arr[i].charAt(3)+arr[i].charAt(4)+arr[i].charAt(5)))
            {
                System.out.println("YES");
            }
            else
            
            System.out.println("NO");
        }
        sc.close();
    }
}
