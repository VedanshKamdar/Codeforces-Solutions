import java.util.Scanner;
public class drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
        {
            int p=sc.nextInt();
            sum =sum+p;
        }
        System.out.println(sum/n);
        sc.close();
    }
}
