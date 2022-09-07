import java.util.Scanner;
public class string_task {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        String st=str.toLowerCase();
        st=st.replaceAll("[a,e,i,o,u,y]","");
        StringBuilder MyString = new StringBuilder(st);
    
        
        int n=MyString.length();
        for(int j=0;j<n;j++)
        {
          System.out.print("."+MyString.charAt(j));
        }
        sc.close();
    }
    
}
