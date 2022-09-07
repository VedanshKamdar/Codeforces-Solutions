import java.util.Scanner;
public class bear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
            while(a<=b)
            {
                a=a*3;
                b=b*2;
                c++;
            }
            System.out.println(c);
            sc.close();
        }
    }

