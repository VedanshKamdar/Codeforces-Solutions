import java.util.Scanner;

public class love_username {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int score1=sc.nextInt();
        int min=score1;
        int max=score1;
        int count=0;
        for(int i=1;i<n;i++)
        {
            int score=sc.nextInt();
            if(score<min)
            {
                min=score;
                count++;
            }
            if(score>max)
            {
                max=score;
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
