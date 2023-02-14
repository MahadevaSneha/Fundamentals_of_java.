/*Sum of Positive square elements
Requested files: Pos.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a  program to find the sum of positive square elements in an array:
Input & Output Format:

First Input consists of size of an array

Remaining inputs corresponds to the number of elements based on the size.

Output consists of an integer.

Sample Input:
3
2
4
6

Sample Output:
4

*/
import java.util.Scanner;
public class Pos
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int s=0,m=0;
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           
       }
       for(int i=0;i<n;i++)
       {
          s=(int)Math.sqrt(a[i]);
          m=s*s;
          if(m>1)
          {
       if(m==a[i])
       {
       System.out.printf("%d",a[i]);
       }
          }
       }
    }
} 
