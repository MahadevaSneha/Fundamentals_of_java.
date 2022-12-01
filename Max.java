/*Maximum Values
Requested files: Max.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to find the maximum element in an array:

Sample Input:
5
1
2
33
4
5

Sample Output:
33
*/
import java.util.Scanner;
public class Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        if(a[i]>max)
        {
            max=a[i];
        }
        }
            System.out.println(max);
        
    }
    
}
