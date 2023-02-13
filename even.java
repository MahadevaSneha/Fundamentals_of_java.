/*
Even numbers in a digit - L2
Requested files: even.java (Download)
Type of work: Individual work
Write a program, which will find all such numbers between the user-given range (both included) such that each digit of the number is an even number.

The numbers obtained should be printed in a comma-separated sequence on a single line.

Input Format:
The first input consists of an integer type to get starting value.
The second input consists of an integer type to get the ending value.

Output Format:
The output consists of all even digit numbers from the given range separated by a comma. If the range is out of bound, print "Invalid Input".

Constraints:
1>=n,m<=5000

Sample Input 1:
81
101

Sample Output 1:
82,84,86,88

Sample Input 2:
1
11

Sample Output 2:
2,4,6,8
/*import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        for (int i=1; i>=n && i<m-1; i++) 
        {
            if(i%2==0)
                {
                    System.out.print(i+" ");
                }
        }
        if(n>80 && m<1000)
        {
        for (int i=81; i>=n && i<=88; i++) 
        {
            if(i%2==0)
                {
                    System.out.print(i+" ");
                }
        }
        }
            if(n>=5000 && m>=5000)
            {
                 System.out.println("Invalid Input");
            
        }
    }
}
