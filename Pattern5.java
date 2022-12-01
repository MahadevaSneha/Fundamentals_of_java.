/*Pattern V
Requested files: Pattern5.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample input 1:
5
Sample output 1:
    *
   **
  ***
 ****
*****

Sample input 2:
8
Sample output 2:
       *
      **
     ***
    ****
   *****
  ******
 *******
********

*/
import java.util.Scanner;
public class Pattern5
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        
       int n=sc.nextInt();
       int i,j,k=0;;
       for(i=1;i<=n;i++,k=0)
       {
           for(j=1;j<=n-i;j++)
               System.out.print(" ");
       
               while(k!=1*i)
               {
                   System.out.print("*");
                   k++;
               }
          
       
           System.out.println();
       }
    }
}
