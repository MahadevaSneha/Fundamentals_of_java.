/*Upper Triangular Matrix
Requested files: Upper.java (Download)
Type of work: Individual work
write a program to find  Upper Triangular Matrix using 2D.

Sample Input:
3
0 0 1
0 2 3
0 0 5

Sample Output:

Upper triangular matrix

*/
import java.util.Scanner;
public class Upper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=r;
        int a[][]=new int[r][r];
        int i;
        int j=0,flag=0;
       for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
            a[i][j]=sc.nextInt();
            }
            
        }
        for(i=1;i<r;i++)
        {
            for(j=0;j<i;j++)
            {
            if(a[i][j]!=0)
            {
                flag=0;
            }
            else
            {
                flag=1;
            }
            }
        }
                if(flag==1)
                {
                    System.out.println("Upper triangular matrix");
                }
                else
                {
                    System.out.println("Not an Upper Triangular Matrix");
                }
        
    }
}
