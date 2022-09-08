import java.util.Scanner;
public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String str;
        str=sc.next();
        str=str.toUpperCase();
        int anton=0;
        int danik=0;
        if(str.length()==n)
        for (int i = 0; i < n; i++) 
        {
            if(str.charAt(i)=='A')
            {
                anton=anton+1;
            }     
            if(str.charAt(i)=='D')
            {
                danik=danik+1;
            }
            
        }
        if(anton>danik)
        System.out.println("Anton");
        else if(anton<danik)
        System.out.println("Danik");
        else if(anton==danik)
        System.out.println("Friendship");
        sc.close();
    }
}
