// 1097A Gennady and a Card Game
import java.util.Scanner;
public class card_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String arr[]=new String[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.next();
        }
        int count=0;
        for(int i=0;i<5;i++)
        {
            if(s.charAt(0)==arr[i].charAt(0) || s.charAt(1)==arr[i].charAt(1))
            count++;
        }
        if(count>0)
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
        }
}
