/*Swapping of two numbers
Requested files: Swap.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to get 2 numbers from the user and swap their values without any loss of data. You can make use of an additional 3rdvariable for swapping. Print the corresponding swapped values of the two numbers as output in the console. 
Input format: 
First input: an integer 
Second input: an integer 
Output format: 
The output will be integers(swapped values)
Sample Input:

20

10

Sample Output:

10

20*/
import java.util.Scanner;
public class Swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
     a=b;
     b=c;
        System.out.println(a);
         System.out.println(b);
        //write your code
    }
}


 
