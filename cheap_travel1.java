import java.util.Scanner;

public class cheap_travel1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int total1=a*n;
        int c=n/m;
        int d=n%m;
        int total2=(c*b)+d*a;
        int total3=(c*b)+b;
        if(m>n)
        {
            if(a*n>b)
            System.out.println(b);
            else
            System.out.println(a);
        }
            else
            {
        if(total2<total3)
        {
        if(total1<total2)
        System.out.println(total1);
        else
        System.out.println(total2);
        }
        else
        {
            if(total1<total3)
            System.out.println(total1);
            else
            System.out.println(total3);
        }
    }

    sc.close();
}
        
    }

