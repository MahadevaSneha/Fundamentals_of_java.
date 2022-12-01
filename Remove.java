/*Remove duplicates of an array
Requested files: Remove.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a  program to remove the duplicate elements from an array:
INPUT FORMAT:

Input consists of 1 integer and 1 array.

The first integer corresponds to the size of the array.

The next integers correspond to the elements in the array.

OUTPUT FORMAT:

The output consists of an array with no duplicate elements.

Sample Input:
5

1

2

3

4

4

Sample Output:

1 2 3 4 
*/
import java.util.Scanner;
public class Remove
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=-1)
            {
                System.out.printf("%d ",a[i]);
            }
        }
    }
}
