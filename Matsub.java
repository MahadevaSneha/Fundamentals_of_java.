/*Matrix Substraction
Requested files: Matsub.java (Download)
Maximum number of files: 5
Type of work: Individual work
write a program to perform matrix subtraction using 2D 

Input Format:

Input consists of 2 integers and 2 matrix.

First input consists of a row.

Second input consists of a column

Third give the elements of the first matrix.

Fourth give the elements of the second matrix.

Output Format:

Output consists of 1 matrix

output consists of a substraction of a matrix



Sample Input:
2
2
1 5
9 4
1 1
1 1

Sample Output:
0 -4
-8 -3


*/
import java.util.Scanner;
public class Matsub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int m[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                m[i][j]=b[i][j]-a[i][j];
         System.out.print(m[i][j]+" ");
            }
             System.out.println();
        }
        
        
    }
}
