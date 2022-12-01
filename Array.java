/*Question-2 (Array)
Requested files: Array.java (Download)
Maximum number of files: 5
Type of work: Individual work
Coding Question 2: Based on the Array
Input: [2,1,0,-8,-9]
Output: 0.4 , 0.2 , 0.4
Explanation:

First, find the total number of elements in the array = 5
Find the total number of positive numbers=2
Find the total number of neutral numbers=1
(0 is the only neutral number)
Find the total number of negative numbers=2
Output = [ (no of positive number/length of the array), (no of neutral numbers/length of the array), (no of negative numbers/length of the array) ]
=[⅖, ⅕, ⅖]
=[0.4, 0.2, 0.4]
Algorithm:

Start the Program
Get the input as an array
Find the length of the array
Find the number of positive, neutral, and negative numbers
Divide each one of the above results with the length of the array and print the output as an array( Make sure you print the output in float format and use 0.1f for one precision)
Stop the program
*/
import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        float flag=0,flag1=0,flag2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
            flag=flag+1;
            }
            else if(a[i]==0)
            {
            flag1=flag1+1;
            }
            else
            {
            flag2=flag2+1;
            }
        }
        System.out.printf("%.1f , %.1f , %.1f",flag/n,flag1/n,flag2/n);
    }
}
