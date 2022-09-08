import java.util.Scanner;
public class new_year_and_hurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        int n=sc.nextInt();
        int t=sc.nextInt();
        t=240-t;
        int fin=0;
         for(int i=1;i<=n;i++)
         {
             total=total+5*i;
             fin=t-total;
         
             if(fin<0)
             System.out.println(i-1);  
             else
             System.out.println(n);
             break;
         }
        sc.close();
    }
}

