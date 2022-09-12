package Contests;

import java.util.Scanner;

public class two_elevators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int [] arr1=new int[t];
        int [] arr2=new int[t];
        int [] arr3=new int[t];
        int [] result=new int[t];
        if(t>=1&&t<=10000)
        for(int i=0;i<t;i++)
        {
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
            arr3[i]=sc.nextInt();
        
            if((Math.abs(arr2[i]-arr3[i])+(arr3[i]-1))>arr1[i]-1)
            {
            result[i]=1;
            }
            else if ((Math.abs(arr2[i]-arr3[i])+(arr3[i]-1))<arr1[i]-1)
            {
            result[i]=2;
            }
            else
            {
                result[i]=3;
            }
        }
        for(int i=0;i<t;i++)
        System.out.println(result[i]);
        sc.close();
    }
}
