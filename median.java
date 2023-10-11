import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[3];
        for(int i=0;i<t;i++){
            for(int j=0;j<3;j++)
            {
                arr[j]=sc.nextInt();
            }
            if ((arr[0] < arr[1] && arr[1] < arr[2]) || (arr[2] < arr[1] && arr[1] < arr[0])) 
                System.out.println(arr[1]);
            else if ((arr[1] < arr[0] && arr[0] < arr[2]) || (arr[2] < arr[0] && arr[0] < arr[1])) 
                System.out.println(arr[0]);
             else 
                System.out.println(arr[2]);
            
        }
        sc.close();
    }
}
