/*Pattern X
Requested files: Pattern10.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample input 1:
5
Sample output 1:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 

Sample input 2:
8
Sample output 2:
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
       */
       import java.util.Scanner;
public class Pattern10
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n-i;j++)
           {
               System.out.printf(" ");
           }
           for(int k=1;k<=(2*i-1);k++)
           {
               System.out.printf("*"); 
           }
            System.out.println();
       }
    for(int i=n-1;i>=1;i--)
       {
           for(int j=1;j<=n-i;j++)
           {
               System.out.printf(" ");
           }
           for(int k=1;k<=(2*i-1);k++)
           {
               System.out.printf("*"); 
           }
            System.out.println();
       }
    }
    
}
