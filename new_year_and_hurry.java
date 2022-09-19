import java.util.Scanner;
public class new_year_and_hurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        int n=sc.nextInt();
        int t=sc.nextInt();
        t=240-t;
        int fin=0;
         for (int j = 1; j<=n; j++) 
         {
             total=total+5*j;
             fin=t-total;
             if(fin<0)
             {
             System.out.println(j-1);  
             }
             else
             {
             continue;
             }
             
         }
         System.out.println(n);
         sc.close();
         }
        
    }


