import java.util.Scanner;

public class george_and_accomodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stay=0;
        for (int i = 0; i < n; i++) 
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y-x>=2)
            stay++;
        }
        System.out.println(stay);
        sc.close();
    }
}
