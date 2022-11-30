/*Sum of Digits
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
          int sum=0;
         int n=sc.nextInt();
         while(n!=0)
         {
             
             int r=n%10;
             n=n/10;
             sum=sum+r;
              
         }
         System.out.printf("%d",sum);
    }
}
