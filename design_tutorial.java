import java.util.Scanner;

public class design_tutorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>12)
        {
        int c=n/2-1;
        System.out.print(c + " ");
        System.out.print(n-c);
    }
    sc.close();
}
}
