/*Count the divisors of a number
Requested files: divisor.java (Download)
Maximum number of files: 5
Type of work: Individual work
Count the number of divisors of a positive integer n.

Random tests go up to n = 500000

Input:
4 
Output:
3,                           *(ie -1,2,4) 

*/
import java.util.Scanner;
class divisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
               
            }
             
        }
          System.out.println(count);
    }
}
