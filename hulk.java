import java.util.Scanner;
public class hulk
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        // if(n==1)
        // {
        //     System.out.print("I hate ");
        // }
        // else
        // {
        //     System.out.print("I hate ");
            for(int i=1;i<=n;i++)
            {
                
                if(i%(2)==0)
                {
                    System.out.print("I love ");
                }
                else
                {
                    System.out.print("I hate ");
                }
                if(i!=n)
                System.out.print("that ");
            }
            System.out.print("it");
            sc.close();
        }
        
        
        
    }
    
