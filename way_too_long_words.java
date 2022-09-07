import java.util.Scanner;

public class way_too_long_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String []arr = new String[n+1];

        if(n>=1&& n<=100)
        {
        for(int i=0;i<n+1;i++)
        {
            arr[i] = sc.nextLine();
        }
        {
            for(int j=0;j<n+1;j++)
            {
                
                if(arr[j].length()<=10)
                {
                    System.out.println(arr[j]);
                }
                else
            {
                System.out.print(arr[j].charAt(0));
                System.out.print((arr[j].length()-2));
                System.out.print(arr[j].charAt(arr[j].length()-1));
            }
            System.out.println();
        }
        sc.close();
    }
}
    }
}    
    