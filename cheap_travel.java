import java.util.Scanner;

public class cheap_travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n%m==0)
        {
            if(n*a==((n/m)*b))
            System.out.println(n*a);
            else if(n*a>((n/m)*b))
            System.out.println((n/m)*b);
            else
            System.out.println(n*a);
        }
        else if(n%m!=0)
        {
            if(n*a<(n/m+1)*b)
            System.out.println(n*a);
            else
            System.out.println((n/m)*b+(n%m)*a);
        }
    }
}
