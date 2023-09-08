// 1343A Candies
import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=2;
            long sum=0;
            while(n%((k*k+k)/2)!=0){
                k++;
            }
            System.out.println(n/((k*k+k)/2));
        }
        sc.close();
    }
}
