import java.util.Scanner;

public class choosing_teams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();

            if(p+k<=5)
            {
                count++;
            }
        }
        System.out.println(count/3);
        sc.close();
    }
}
