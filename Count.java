/*Count Odd or Even
Requested files: Count.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to count the number of even and odd elements in an array:

Sample Input:
3
1
2
3

Sample Output:
Odd: 2
*/
import java.util.Scanner;
public class Count
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
             int count=0;
             int count1=0;
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
         {
            if(a[i]%2==1)
            {
               count=count+1;
            }
        }
        System.out.printf("Odd: %d\n",count);
        for(int i=0;i<n;i++)
        {
        if(a[i]%2==0)
        {
            count1=count1+1;
        }
        }
        System.out.printf("Even: %d",count1);
    }
}
