/*Factorial value-L1
Requested files: FactorialValue.java (Download)
Type of work: Individual work
Define a function that can accept an integer number as input and print it as a prime number or not if it is odd and print its factorial value if it is even using recursion.

Sample input:

3

Sample output:

The given number is ODD and also a prime number.

*/
import java.util.Scanner;
class FactorialValue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        int fact=1;
         for(int i=1;i<=n;i++)
         {
             fact=fact*i;
             
             if(n%i==0)
             {
                 
                flag++;
            
             }
            
         }
        if(n%2==1 && flag==2)
        {
            System.out.println("The given number is ODD and also a prime number");
        }
        else if(n%2==1 && flag!=2)
        {
            System.out.println("The given number is ODD but not a prime number");
        }
        else
            {
        System.out.printf("The given number is EVEN, so the factorial value of %d is %d",n,fact);

        }
    }
}
