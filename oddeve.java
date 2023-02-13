/*Check if a number odd or even then multiply it with an operand
Requested files: oddeve.java (Download)
Type of work: Individual work
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.



Input:

4

Output:

32

Input:

3

Output:

27
*/
import java.util.Scanner;
class oddeve
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s;
        if(n%2==0)
        {
            s=n*8;
            System.out.println(s);
        }
        else
        {
          s=n*9;
          System.out.println(s);
        }
    }
}
