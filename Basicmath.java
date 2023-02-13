/*Array Mean
Requested files: Basicmath.java (Download)
Maximum number of files: 5
Type of work: Individual work
Find the mean (average) of a list of numbers in an array.

Information
To find the mean (average) of a set of numbers, add all the numbers together and divide by the number of values in the list.

For example list of 1, 3, 5, 7

1. Add all of the numbers

1+3+5+7 = 16
2. Divide by the number of values in the list. In this example, there are 4 numbers in the list.

16/4 = 4
3. The mean (or average) of this list is 4



Sample Input:
4
1 3 5 7

Sample Output:
4.0

*/
import java.util.Scanner;
class Basicmath
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        float sum=0;
        float total=0;
        for(int i=1;i<=n;i++)
        {
           sum=sum+n;
           total=sum/i;
        }
        System.out.printf("%.1f",total);
         
    }
}
