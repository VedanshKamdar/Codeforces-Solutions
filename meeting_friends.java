import java.util.Scanner;

public class meeting_friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp;

    if (b < a) {
      temp = a;
      a = b;
      b = temp;
    }

    if (c < b) {
      temp = b;
      b = c;
      c = temp;
    }

    if (b < a) {
      temp = a;
      a = b;
      b = temp;
    }
        System.out.println((Math.abs(a-b)+Math.abs(b-c)));
    }
}
