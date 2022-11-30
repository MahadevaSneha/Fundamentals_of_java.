/*Series VII
Requested files: Series7.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to generate the following series --- 1, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input & Output:

5

1 2.0 3.0 6.0 9.0 

*/
import java.util.Scanner;
public class Series7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double b=1,c=2;
        System.out.printf("%.0f %.1f ",b,c);
        float s=1;
        for(int i=1;i<=n-1;i++)
        {
            if(i%2==1)
            {
            b=b*3;
        System.out.printf("%.1f ",b);
            }
            else
            {
            c=c*3;
        System.out.printf("%.1f ",c);
            }
    
        }
        
        
    }
}
