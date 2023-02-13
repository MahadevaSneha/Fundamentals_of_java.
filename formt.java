/*Formatting decimal places
Requested files: formt.java (Download)
Maximum number of files: 5
Type of work: Individual work
Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.
Input:
5.5589
Output:
5.56 */
import java.util.Scanner;
class formt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        System.out.printf("%.2f",n);
    }
}
