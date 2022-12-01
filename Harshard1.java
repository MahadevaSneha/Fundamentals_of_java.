/*Method- Harshard Number
Requested files: Harshard1.java (Download)
Maximum number of files: 5
Type of work: Individual work
Program to check whether a number is a Harshad number or not (Niven number) is discussed here. Harshad Number is an integer that is divisible by the sum of its digits.

 Input format:

Input consists of 1 integer.
If the given number is Harshad Number display Harshad Number or display Not Harshad Number.
Sample Input:

1729

 Sample Output:

Harshad Number

*/
import java.util.Scanner;
public class Harshard1
{
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     Harshard1 hd=new Harshard1();
     int a=hd.Hars(n);
        if(n%a==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}
class Harshard1
{
    public static int Hars(int n)
    {
        int sum=0,r;
        
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
            
        }
        return sum;
    }
}
