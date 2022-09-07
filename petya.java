import java.util.Scanner;
public class petya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String a=sc.next();
        String b=sc.next();
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        if(c.length()==d.length()) 
        {
            if(c.compareTo(d)==0)
            {
                System.out.println("0");
            }
            else if(c.compareTo(d)>0)
            {
                System.out.println("1");
            }else
            {
                System.out.println("-1");
            }
        }  
        
        sc.close();
    }
}
