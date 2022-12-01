/*Sum of elements in each row
Requested files: Sumofelements.java (Download)
Type of work: Individual work
Write a  program to find the sum of elements in each row:

INPUT & OUTPUT FORMAT:

Input consists of 2 integers and 1 2D-array. 

Integers correspond to the size of rows and columns.

Output consists of 3 integers.

Output consists of the values which is the sum of all the rows.

Sample Input:

3
3
1 2 3
7 3 1
7 4 1

Sample Output:
6
11
12
*/
import java.util.Scanner;
public class Sumofelements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
         for(i=0;i<r;i++)
        {
            int sum=0;
            for(j=0;j<c;j++)
            {
                sum=sum+a[i][j];
            }
            System.out.println(sum);
            
        }
        
    }
}
