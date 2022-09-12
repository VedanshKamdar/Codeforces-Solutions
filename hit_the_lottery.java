import java.util.Scanner;

public class hit_the_lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cent=n/100;
        int cent_rem=n%100;
        int twen=cent_rem/20;
        int twen_rem=cent_rem%20;
        int ten=twen_rem/10;
        int ten_rem=twen_rem%10;
        int five=ten_rem/5;
        int five_rem=ten_rem%5;
        int one=five_rem/1;
        System.out.println(cent+twen+ten+five+one);
        sc.close();
    }
}
