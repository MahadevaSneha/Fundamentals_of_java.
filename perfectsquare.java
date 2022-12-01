/*Perfect Square-L1
Requested files: perfectsquare.java (Download)
Type of work: Individual work

Write a function which can store the perfect square values in a list. The user will define the range.


Sample input:

1

20

Sample output:

4 9 16

*/
import java.util.Scanner;
public class perfectsquare
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=n+1;i<m;i++)
    {
        if(Math.sqrt(i)==(int)Math.sqrt(i))
        System.out.println(i);
    }
    }
}

