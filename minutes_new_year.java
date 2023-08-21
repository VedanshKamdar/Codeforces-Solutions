import java.util.Scanner;
public class minutes_new_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr1[]=new int[t];
        // int h=0;
        int arr2[]=new int[t];
        for (int i=0;i<t;++i){
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
    }
    for(int i=0;i<t;i++)
    {
        if(arr1[i]<23 && arr1[i]<24 && arr2[i]<60)
        System.out.println(((23-arr1[i])*60)+(60-arr2[i]));
        else
        System.out.println(60-arr2[i]);
    }
    sc.close();
}
}