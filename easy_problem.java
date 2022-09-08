import java.util.Scanner;
public class easy_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]==1)
            {
            c++;
        }
    }
        if(c==0)
        {
            System.out.println("EASY");
        }
            else
            {
            System.out.println("HARD");
            }
            sc.close();
    }
    }

