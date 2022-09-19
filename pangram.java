import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String st=sc.next();
        int pan=0;
        if(st.length()==n)
        st=st.toLowerCase();
        for(char i='a';i<='z';i++)
        {
            
            if(st.contains(String.valueOf(i)))
            {   
                pan++;
            }
        }
        if(pan>=26)
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}
