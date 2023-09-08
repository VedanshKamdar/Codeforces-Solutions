import java.util.Scanner;

public class corridor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int d[]=new int[n];
            int s[]=new int[n];
            for(int j=0;j<n;j++)
            {
                d[j]=sc.nextInt();
                s[j]=sc.nextInt();
            }
            for (int m = 0; m < n - 1; m++) {
                for (int j = 0; j < n - 1 - m; j++) {
                    if (d[j] > d[j + 1]) {
                        // Swap d values
                        int tempD = d[j];
                        d[j] = d[j + 1];
                        d[j + 1] = tempD;
    
                        // Swap corresponding s values
                        int tempS = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = tempS;
                    }
                }
            }
            
            sc.close();
        }
        
    }

}
