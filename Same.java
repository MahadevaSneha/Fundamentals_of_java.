/*Same or not
Requested files: Same.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a  program to find whether two arrays are same or not. Two arrays are said to be same if the sum of both the arrays are same and size of arrays are same:

INPUT FORMAT:

Input consists of 2 integers and 2 arrays.

Integers correspond to the size of arrays.

If two arrays are same, display "Same" else display "Not Same"


Sample Input:
3
3
1
2
3
1
2
3

Sample Output:
Same


*/
import java.util.Scanner;
public class Same
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int sum=0,sum1=0;
    int n=sc.nextInt();
    int a[]=new int[n];
    int s=sc.nextInt();
    int b[]=new int[s];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        sum=sum+a[i];
    }
    for(int j=0;j<s;j++)
    {
        b[j]=sc.nextInt();
        sum1=sum1+b[j];
    }
    if(n==s)
    {
    if(sum==sum1)
    {
        System.out.println("Same");
    }
    else
    {
        System.out.println("Not Same");
    }
    }
    }
}
