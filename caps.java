import java.util.Scanner;

public class caps
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		char[] ch = p.toCharArray();
		boolean c = true;
		for(int i=1; i<ch.length; i++)
		    if(Character.isLowerCase(ch[i]))
		        c = false;
		if(c == true)
		    for(int i=0; i<ch.length; i++)
		        if(Character.isUpperCase(ch[i]))
		           ch[i] = Character.toLowerCase(ch[i]);
		        else
		           ch[i] = Character.toUpperCase(ch[i]);
		for(int i=0; i<ch.length; i++)
		    System.out.print(ch[i]);
            sc.close();
	}
}