import java.util.Scanner;

public class mishka_and_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mishka=0;
        int chris=0;
        int [] arr1=new int[n];   
        int [] arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            if(arr1[i]>arr2[i])
            mishka++;
            else if(arr1[i]<arr2[i])
            chris++;
            else
            continue;
        }   
        if(mishka>chris)
        System.out.println("Mishka");
        else if(chris>mishka)
        System.out.println("Chris");
        else
        System.out.println("Friendship is magic!^^");
        sc.close();
       }
}
