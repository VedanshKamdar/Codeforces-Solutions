// 43A Football
import java.util.Scanner;

public class footbal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int count1=1,count2=0;
        String m="";
        String arr[]=new String[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextLine();
            if(arr[i].equals(s))
            count1++;
            else
            m=arr[i];
            count2++;
            }
            if(count1>count2)
            System.out.println(m);
            else
            System.out.println(s);
        sc.close();
    }
}
