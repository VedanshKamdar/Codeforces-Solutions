import java.util.Scanner;
public class capitalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(str.charAt(j)==str.charAt(i))
                count++;
            }
            if(count!=0)
        System.out.println("IGNORE HIM!");
                else
                System.out.println("CHAT WITH HER!");
        }
        sc.close();
    }
}
