/*Reverse a Number
Requested files: Reverse.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write program to reverse a number is discussed here. We can reverse a number using loop and arithmetic operators in both iterative and recursive approaches. 

Input & Output Format:

Input consists of a integer.

Output consists of reversed input.

Sample Input: 

13579

Sample Output: 

97531

*/
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0,r;
        while(n!=0)
        {
           r=n%10;
           rev=rev*10+r;
           n=n/10;
           
        }
            System.out.printf("%d",rev);
    }
}
