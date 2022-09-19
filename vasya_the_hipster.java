import java.util.Scanner;

public class vasya_the_hipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int red=sc.nextInt();
        int blue=sc.nextInt();
        if(red>blue)
        {
            System.out.print(blue + " ");
            int rem=(red-blue)/2;
            System.out.println(rem);
        }
        else if(red<blue)
        {
            System.out.print(red+" ");
            int rem=(blue-red)/2;
            System.out.println(rem);
        }
        else 
        {
            System.out.print(red+" ");
            System.out.println("0");
        }
        sc.close();
    }
}
