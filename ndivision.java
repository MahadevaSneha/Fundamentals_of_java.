/*N Division - L1
Requested files: ndivision.java (Download)
Type of work: Individual work
Write a program that will find all such numbers which are divisible by 7 but are not a multiple of 5. The numbers obtained should be printed in a comma-separated sequence on a single line.

Input Format:
The first line consists of an integer value as starting value
The second line consists of an integer value as the ending value.

Output Format:
The output consists of numbers that are all divisible by 7 and are not a multiple of 5 with the given range.

Sample input:
1
25

Sample Output:
7 14 21

*/
import java.util.Scanner;
public class ndivision
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=7;
    for(int i=1;i<=100;i++)
    {
        int s=x*i;
        if((s>n)&&(s<m))
        {
        if((s%x==0)&&(s%5!=0))
        {
            System.out.printf("%d ",s);
        }
        }
    }
    }
}
