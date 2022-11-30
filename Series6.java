/*Series VI
Requested files: Series6.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to generate the following series --- 0,2,8,14,...,34 

Input format: 

The input containing an integer which denotes 'n'

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

0 2 8 14 24 

*/
import java.util.Scanner;
public class Series6
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int s=0;
      System.out.print("0 2 ");
     for(int i=3;i<=a;i++)
     {
     if(i%2==1)
     {
          s=(i*i)-1;
         System.out.printf("%d ",s);
     }
     else
     {
         s=(i*i)-2;
         System.out.printf("%d ",s);
     }
     }
    }
}
