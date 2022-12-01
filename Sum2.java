/*Methods-sum of digits
Requested files: Sum.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to find the sum of digits in a given number. Program to find the sum of digits of the given number is discussed here. 
For example, let the input number be 719. The sum of digits of 719 = 7 + 1 + 9 = 17
Input & Output Format:

Input consists of one integer.

Output consists of sum of digits.

Sample Input:

719

Sample Output:

17
*/
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Sum1 s=new Sum1();
        int n=sc.nextInt();
       System.out.println(s.add(n));
    }
}
class Sum1
{
    public static int add(int n)
    {
        int sum2=0,r;
        while(n!=0)
        {
            r=n%10;
            sum2=sum2+r;
            n=n/10;
           
        }
          return sum2;
    }
}
