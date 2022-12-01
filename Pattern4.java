/*Pattern VI
Requested files: Pattern4.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample input 1:
5
Sample output 1:
*****
****
***
**
*

Sample input 2:
8
Sample output 2:
********
*******
******
*****
****
***
**
*

*/
import java.util.Scanner;
public class Pattern4
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int j,i;
       int n=sc.nextInt();
       for(i=n;i>=1;i--)
       {
           for(j=i;j>=1;j--)
           {
               System.out.printf("*");
           }
           System.out.printf("\n");
       }
       }
}
