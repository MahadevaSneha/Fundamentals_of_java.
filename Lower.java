/*Lower Triangular Matrix
Requested files: Lower.java (Download)
Type of work: Individual work
write a program to find Lower Triangular Matrix using 2D.

Sample Input:
3
1 0 0
4 5 0
1 0 0

Sample Output:
Lower triangular matrix

*/
import java.util.Scanner;
public class Lower
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
            if(a[i][j]==0)
            {
                flag=0;
            }
            else
            {
                flag=1;
            }
            }
        }
                if(flag==0)
                {
                    System.out.println("Lower triangular matrix");
                }
                else
                {
                    System.out.println("Not a Lower triangular matrix");
                }
        
    }
}
