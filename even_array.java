//1367B Even Array
import java.util.Scanner;

public class even_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int even=0,odd=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0)
                    even++;
                else
                    odd++;
            }
            if(even>odd){
                int count=0;
                for(int i=0;i<n;i++){
                    if(a[i]%2!=0){
                        for(int j=i+1;j<n;j++){
                            if(a[j]%2==0){
                                int temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                                count++;
                                break;
                            }
                        }
                    }
                }
                System.out.println(count);
            }
            else{
                int count=0;
                for(int i=0;i<n;i++){
                    if(a[i]%2==0){
                        for(int j=i+1;j<n;j++){
                            if(a[j]%2!=0){
                                int temp=a[i];
                                a[i]=a[j];
                                a[j]=temp;
                                count++;
                                break;
                            }
                        }
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
