package LABpack;
import java.util.Scanner;
public class Matrix_mul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=0;
        System.out.print("Enter the size of square matrix:");
        int b=sc.nextInt();
        int matr1[][]=new int[b][b],matr2[][]=new int[b][b],res[][]=new int[b][b]; // matrix declaration

        //creating matrix
        System.out.print("Enter the numbers for 1st matrix:");
        for (int i=0;i<b;i++)
        {
            for (int j=0;j<b;j++)
            {
                int val= sc.nextInt();
                matr1[i][j]=val;
            }
        }

        System.out.print("Enter the numbers for 2nd matrix:");
        for (int i=0;i<b;i++)
        {
            for (int j=0;j<b;j++)
            {
                int val= sc.nextInt();
                matr2[i][j]=val;
            }
        }

        // feeding values to result matrix
        for (int i=0;i<b;i++)
        {
            for (int j=0;j<b;j++)
            {
                for (int m=0;m<b;m++)
                {
                    int k=matr1[i][m]*matr2[m][j];
                    value=value+k;
                }
                res[i][j]=value;
                value=0;
            }
        }

        // Display result matrix
        System.out.println("Result of matrix:");

        for (int i=0;i<b;i++)
        {
            for (int j=0;j<b;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
