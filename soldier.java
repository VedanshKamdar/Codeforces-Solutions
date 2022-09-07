import java.util.Scanner;
public class soldier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        for(int i=1;i<=w;i++)
        {
            total=total + i*k;
        }
        int debt=total-n;
        if(debt<0)
        {
            System.out.println("0");
        }else
        System.out.println(debt);
        sc.close(); 
    }
    
}
