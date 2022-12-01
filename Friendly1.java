/*Method-Friendly Pair
Requested files: Friendly.java (Download)
Maximum number of files: 5
Type of work: Individual work
 Program to find if the given numbers are Friendly pair or not (Amicable or not) is discussed here. Friendly Pair are two or more numbers with a common abundance.

Input & Output format: 

Input consists of 2 integers.
The first integer corresponds to number 1 and the second integer corresponds to number 2.
If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair.
For example,6 and 28 are Friendly Pair.

(Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.

Sample Input:
6

28

Sample Output:

Friendly Pair



*/
import java.util.Scanner;
public class Friendly1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Friendly1 f=new Friendly1();
        Friendly2 f1=new Friendly2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=f.Friend(a);
        int sum1=f1.Friend(b);
        if(sum==sum1)
          System.out.println("Friendly Pair");  
        else
            System.out.println(" Not Friendly Pair");
    }
}
class Friendly1
{
    public static int Friend(int a)
    {
        int sum=0;
        for(int i=1;i<a;i++)
    {
        if(a%i==0)
        
          sum=sum+i;  
    }  
        sum=sum/a;
         return sum;    
    
    
    }
}
   class Friendly2
{
    public static int Friend(int b)
    {
        int sum1=0;
        for(int i=1;i<b;i++)
    {
        if(b%i==0)
        
          sum1=sum1+i;  
    }  
        sum1=sum1/b;
         
     return sum1;
    }
}
