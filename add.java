/*Write a code to add two numbers
Requested files: add.java (Download)
Maximum number of files: 5
Type of work: Individual work
Jeevan just started learning Java and C#. At first, he wrote a simple program that was supposed to sum up two small numbers (numbers and their sum fit in a byte), but it didn't work. Vasya was too sad to find out what was wrong. Help him to correct the mistake.

Input:

5

6

Output:

11
*/
import java.util.Scanner;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        System.out.println(n+s);
        
    }
}
