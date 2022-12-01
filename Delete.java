/*Delete the Element
Requested files: Delete.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a C program to delete the element from the given location in an array:

Input & Output Format:

Input consists of two integer and one array.
First Input consists of size of an array.
Second give the array elements based on their size.
Third input consists of the position where we need to delete it.
Output consists of an array after deletion.

Sample Input:
5
1
2
3
4
5

4

Sample Output:
1
2
3
5
*/
import java.util.Scanner;
public class Delete
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          if(d==a[i])
          {
           count=count+1;
          }
        }
        if(count==n)
        { 
              System.out.println("Invalid Input"); 
        }
        else
        {
            for(int j=0;j<n;j++)
           {
            if(a[j]!=d)
            System.out.println(a[j]);
           }
          System.out.println("Invalid Input");
        }
        }
}
