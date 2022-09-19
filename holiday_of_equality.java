import java.util.Scanner;

public class holiday_of_equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        int temp;
        for (int i = 0; i < n; i++)   
        {  
            for (int j = i + 1; j < n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
        System.out.println(n*(arr[n-1])-total);
    }
}
