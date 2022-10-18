import java.util.Scanner;
public class odd_divisor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int j=1;j<=n;j++)
        {
            int num=sc.nextInt();
            {
            for(int i=3;i<=num;i=i+2)
            {
                if(num%i==0)
                c++;
            }
            if(c>=1)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
        }
        }
    }
