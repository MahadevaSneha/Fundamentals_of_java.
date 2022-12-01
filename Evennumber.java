/*Array
Requested files: Evennumber.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to find the single-digit even number in an array. 

Sample Input: 

Enter the size of an array:

3

Enter the array elements:

1

2

3

Sample output:


Single digit even number is: 2

*/
import java.util.Scanner;
public class Evennumber
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    int count=0;
     if(n==0)
        {
            System.out.println("Invalid array size");
        }
        else
        {
    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }

    for(int i=1;i<n;i++)
    {
        if(a[i]%2==0&&a[i]>0&&a[i]<9)
        {
            System.out.printf("Single digit even number is: %d",a[i]);
            count++;
        }
    }
    if(count==0)
    System.out.println("Single digit even number is not found in the array");
     
    }
    }
     
}
