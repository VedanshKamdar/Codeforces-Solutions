import java.util.Scanner;
public class I_love_java
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int count=0;
    int n=sc.nextInt();
    int [] arr=new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++)
    {
        if(arr[i]>arr[i-1])
        count++;
    }
    System.out.println(count);
}
}