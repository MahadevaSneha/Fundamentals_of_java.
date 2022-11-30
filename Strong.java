/*Strong Number
Requested files: Strong.java (Download)
Maximum number of files: 5
Type of work: Individual work
Program to check if a given number is a strong number or not is discussed here. A strong number is a number in which the sum of the factorial of the digits is equal to the number itself.

Input & Output Format:
Input consists of one integer.

Output consists of a string. 

If it is true then display "Strong Number" else display "Not a Strong Number".

Sample Input & Output:

145

Strong Number



*/
import java.util.Scanner;
public class Strong
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int temp=n;
         int fact,r,sum=0;
         while(n!=0)
         {
             r=n%10;
             fact=1;
             for(int i=1;i<=r;i++)
             fact=fact*i;
             sum=sum+fact;
                n=n/10;
         }
         
         if(temp==sum)
         {
             System.out.println("Strong Number");
         }
         else
         {
              System.out.println("Not a Strong Number");
         }
    }
}
