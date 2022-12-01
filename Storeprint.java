/*Question-3(2D-Array)
Requested files: Storeprint.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to get store the User's data in a 2D array and print it.

Sample Input: 

Enter Elements1

2

3

4

5

6

7

8

9

Sample Output:

Printing Elements...



1       2       3

4       5       6

7       8       9
*/
import java.util.Scanner;
public class Storeprint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter Elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing Elements...");
    for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
