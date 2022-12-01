/*Sum of Zig-Zag Pattern
Requested files: Zigzag.java (Download)
Type of work: Individual work
Write a program to find the sum of Zig-Zag pattern:

INPUT & OUTPUT FORMAT: 

Input consists of 2 integers and 1 2D-array. Integers correspond to the size of rows and columns.

Output consists of the sum of zig zag pattern


Sample Input:
3
3
1 2 3
4 5 6
7 8 9

Sample Output:
35

*/
import java.util.Scanner;
public class Zigzag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int sum=0;
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
            for(j=0;j<r;j++)
            {
                if(i==0&&j<c||i==1&&j==(c-2)||i==(r-1)&&j<c)
                {
                sum=sum+a[i][j];
                }
            }
            
            
        }
        System.out.println(sum);
        
    }
}
