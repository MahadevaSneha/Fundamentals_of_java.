/*Sum of array elements
Requested files: Sumarray.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a  program to find the sum of elements in an array.

Sample Input:

3
1
2
3

Sample Output:
6
*/
import java.util.Scanner;
public class Sumarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
