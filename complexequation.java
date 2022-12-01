/*complex equation results L1
Requested files: complexequation.java (Download)
Type of work: Individual work
Write a program that calculates and prints the value according to the given formula: Q = Square root of [(2 * C * D)/H]. Following are the fixed values of C and H: C is 50. H is 30. D is the variable whose values should be input to your program in a comma-separated sequence.

Example

Let us assume the following comma separated input sequence is given to the program:

Input

100

150

180

output

18 22 24

*/
import java.util.Scanner;
public class complexequation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c=50,h=30;
        int n=3,d;
        for(int i=1;i<=n;i++)
        {
            d=sc.nextInt();
            double s=Math.sqrt((2*c*d)/h);
            
        System.out.printf("%.0f ",s);
        }
    }
}
