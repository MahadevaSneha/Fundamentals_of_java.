/*Calculation of square values-L1
Requested files: square.java (Download)
Type of work: Individual work
Write a method that can calculate the square value of n given values until and unless user gives -1.

Sample input:

5

4

3

-1

Sample output:
25

16

9

*/
import java.util.Scanner;
public class square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    
        for(int i=1;i<=5;i++)
        {
            int n=sc.nextInt();
             
            if(n!=-1)
            {
            int s=n*n;
            System.out.println(s);
             
            }
            else
            {
                System.out.println("invalid input");
            }
        }
    }
}
