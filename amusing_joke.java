import java.util.Scanner;

public class amusing_joke {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        String st3=sc.nextLine();
        if(st3.length()==(st1.length()+st2.length()))
        {
            if(st3.contains(st1)&&(st3.contains(st2)))
            {
                System.out.println("YES");

            }
            else
            {
                System.out.println("NO");
            }
        }

    }
}
