/*Method-Sum and Difference
Requested files: SumDiff.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively. Print the corresponding sum and difference of the numbers as output in the console.

 Input format:

First input: an integer 

Second input: an integer 

Output format:

First output will be the sum of two integers

Second output will be the difference of two integers

Sample Input:

55

34

Sample Output:

89

21

*/
import java.util.Scanner;
public class SumDiff1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Calculation cal=new Calculation();
        Calculation1 calc=new Calculation1();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(cal.Add1(a,b));
        System.out.println(calc.Sub1(a,b));
        
    }
}
class Calculation
{
    public static int Add1(int a,int b)
    {
    int sum=a+b;
    return sum;
    }
}
class Calculation1
{
    public static int Sub1(int a,int b)
    {
    int sub=a-b;
    return sub;
    }
}
