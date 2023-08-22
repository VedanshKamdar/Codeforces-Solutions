import java.util.Scanner;

public class Vanya_and_Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum= sum +i*(i+1)/2;
            if(n>sum)
            continue;
            else if(n==sum){
            System.out.println(i);
            break;}
            else
            System.out.println(i-1);
            break;
        }
        sc.close();
    }
}
