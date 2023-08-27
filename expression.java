import java.util.Scanner;

public class expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int arr[]=new int[6];
        arr[0]=a+b+c;
        arr[1]=a*b*c;
        arr[2]=a+b*c;
        arr[3]=a*b+c;
        arr[4]=(a+b)*c;
        arr[5]=a*(b+c);
        int sum=arr[0];
        for(int i=1;i<6;i++)
        {
            if(arr[i]>sum)
            sum=arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
