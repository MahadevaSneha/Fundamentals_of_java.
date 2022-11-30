/*Series IV
Requested files: Series4.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to generate the following series --- 0.5,1.5,4.5,13.5,...

 Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

0.5 1.5 4.5 13.5 40.5 

*/
import java.util.Scanner;
public class Series4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float m=3,n=1;;
        float s=n/2; 
        for(int i=1;i<=a;i++)
        {
               System.out.printf("%.1f ",s);
                 s=s*m;
             
        }
        
    }
}
