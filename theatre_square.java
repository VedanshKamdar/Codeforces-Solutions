import java.util.Scanner;
import java.lang.Math;
public class theatre_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double m=sc.nextInt();
        double a=sc.nextInt();
        
        if(n>=1&&m>=1 && a<=Math.pow(10, 9))
        {
            int m_area= (int) Math.ceil(m/a);
            int n_area= (int) Math.ceil((n)/a);
            int result = (int)(m_area*(n_area));
            System.out.println(result);
        }
        sc.close();
    }
}