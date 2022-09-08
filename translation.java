import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.next();
        String t=sc.next();
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length())
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==t.charAt(s.length()-i-1))
            c++;
        }
        if(c==s.length())
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}
