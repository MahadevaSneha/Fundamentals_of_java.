/*sum of two numbers-L1
Requested files: sotn.java (Download)
Type of work: Individual work
Define a function which can compute the sum of two numbers using recursion.

sample input:

4

8

Sample output:

12
*/
import java.util.Scanner;
public class sotn
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Sum1 s=new Sum1();
        int n=sc.nextInt();
        int m=sc.nextInt();
       System.out.println(s.add(n,m));
    }
}
class Sum1
{
    public static int add(int n,int m)
    {
      int sum;
      sum=n+m;
    return sum;
    }
}
