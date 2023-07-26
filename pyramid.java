package LABpack;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pyramid levels:");
        int n= sc.nextInt();

        for (int i=1;i<n+1;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<=(2*i-1);j++)
            {
                System.out.print(j+" ");
            }
            for (int j=(2*i-2);j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}