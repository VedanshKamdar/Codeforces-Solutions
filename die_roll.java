import java.util.Scanner;
import java.lang.Math;

public class die_roll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int w=sc.nextInt();
        int a=Math.max(y, w);
        if(a==1)
        System.out.println("1/1");
        else if(a==2)
        System.out.println("5/6");
        else if(a==3)
        System.out.println("2/3");
        else if(a==4)
        System.out.println("1/2");
        else if(a==5)
        System.out.println("1/3");
        else
        System.out.println("1/6");

        sc.close();
    }
}
