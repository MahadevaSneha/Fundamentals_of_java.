/*Series I
Requested files: Series1.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to generate the following series --- 1,4,9,16,25, .... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input :

7

Sample Output:

1 4 9 16 25 36 49 



*/
import java.util.Scanner;
public class Series1
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             int s=i*i;
             System.out.printf("%d ",s);
         }
    }
}
