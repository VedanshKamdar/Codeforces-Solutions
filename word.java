import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lower=0;
        int upper=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            lower++;
            else 
            upper++;
        }
        if(lower<upper)
        {
            System.out.println(str.toUpperCase());
        }
        else if(lower>upper)
        {
            System.out.println(str.toLowerCase());
        }
        else
        {
            System.out.println(str.toLowerCase());
        }
        sc.close();
    }
}
