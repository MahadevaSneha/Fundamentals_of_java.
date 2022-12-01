/*Method- Product and Division
Requested files: ProDiv1.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to get 2 numbers from the user and calculate their product, quotient and remainder using '*', '/' and '%' operators respectively. Print the corresponding product, quotient and remainder of the numbers as output in the console. 

Input format: 

First input: an integer

Second input: an integer 

Output format: 

The first output will be the product of two integers 

The second output will be the quotient 

The third output will be the remainder

Sample Input:

50

10

Sample Output:

500

5

0

*/
import java.util.Scanner;
public class ProDiv1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Calculation cal=new Calculation();
        Calculation1 calc=new Calculation1();
        Calculation2 calcu=new Calculation2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(cal.Mul1(a,b));
        System.out.println(calc.Div1(a,b));
        System.out.println(calcu.Mod1(a,b));
        
    }
}
class Calculation
{
    public static int Mul1(int a,int b)
    {
    int mul=a*b;
    return mul;
    }
}
class Calculation1
{
    public static int Div1(int a,int b)
    {
    int div=a/b;
    return div;
    }
}
class Calculation2
{
    public static int Mod1(int a,int b)
    {
    int mod=a%b;
    return mod;
    }
}
 
