import java.util.Scanner;

public class anton_and_polyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String [] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].contains("Tetrahedron"))
            {
                count=count+4;
            }
            else if(arr[i].contains("Cube"))
            {
                count=count+6;
            }
            else if(arr[i].contains("Octahedron"))
            {
                count=count+8;
            }
            else if(arr[i].contains("Dodecahedron"))
            {
                count=count+12;
            }
            else if(arr[i].contains("Icosahedron"))
            {
                count=count+20;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
