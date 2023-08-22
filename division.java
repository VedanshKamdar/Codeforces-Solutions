import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String ans[]=new String[t];
        int arr[]=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<=1399)
            ans[i]="Division 4";
            else if(arr[i]>=1400 && arr[i]<=1599)
            ans[i]="Division 3";
            else if(arr[i]>=1600 && arr[i]<=1899)
            ans[i]="Division 2";
            else if(arr[i]>=1900)
            ans[i]="Division 1";
        }
        for(int i=0;i<t;i++)
        System.out.println(ans[i]);
        
        sc.close();
    }
}
