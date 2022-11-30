/*Palindrome of a number
Requested files: Palindrome.java (Download)
Maximum number of files: 5
Type of work: Individual work
Program to check whether the given number is a Palindrome or  Not a Palindrome is discussed here. Any number is said to be a palindrome if the original number and the reverse of the original number are the same.

For example, 1234321 is a palindrome.

Original number = 1234321

The reverse of the number = 1234321

Sample Input:
454

Sample Output:

Palindrome

*/
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int r;
         int sum=0;
         int n=sc.nextInt();
         int temp=n;
         while(n!=0)
         {
             r=n%10;
             sum=(sum*10)+r;
             n=n/10;
         }
         if(temp==sum)
         {
             System.out.println("Palindrome");
         }
         else
         {
             System.out.println("Not a Palindrome");
         }
         
    }
    
}
