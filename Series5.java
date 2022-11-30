/*Series V
Requested files: Series5.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to generate the following series --- 121,225,361,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

121 225 361 529 729 

*/
import java.util.Scanner;
public class Series5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=11;
        int n=4;
        for(int i=1;i<=a;i++)
        {
          int s=m*m;
        System.out.printf("%d ",s);
           m=m+n;
          
       
        }
    
    }
}
