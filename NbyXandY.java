/*Is N divisible by X and Y?
Requested files: NbyXandY.java (Download)
Maximum number of files: 5
Type of work: Individual work
Given a number N. Given two numbers X and Y, the task is to find the sum of all those numbers from 1 to N that are divisible by X or by Y.

Approach: To solve the problem, follow the below steps:
->Find the sum of numbers that are divisible by X upto N. Denote it by S1. 
->Find the sum of numbers that are divisible by Y upto N. Denote it by S2. 
->Find the sum of numbers that are divisible by both X and Y upto N. Denote it by S3. 
->The final answer will be S1 + S2 – S3.

For S1: The total numbers that will be divisible by X upto N will be N/X and the sum will be: 
S1 = ((N/X)/2) * (2 * X + (N/X - 1) * X)

For S2: The total numbers that will be divisible by Y upto N will be N/Y and the sum will be: 

S2 = ((N/Y)/2) * (2 * Y + (N/Y - 1) * Y)
For S3: The total numbers that will be divisible by both X and Y upto N will be N/lcm(X, Y) and the sum will be: 

S2 = ((N/lcm(X, Y))/2) * ((2 * lcm(X,Y)) + (N/lcm(X,Y) - 1) * lcm(X,Y))/2
Therefore, the result will be: 
S = S1 + S2 - S3

Sample Input-1:

14

6

5

Sample Output-1:

33

*/
import java.util.Scanner;
public class NbyXandY{
static int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	
	static int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}

	static int sum(int N, int X, int Y)
	{
int S1 = ((N/X)/2) * (2 * X + (N/X - 1) * X);
int S2 = ((N/Y)/2) * (2 * Y + (N/Y - 1) * Y);
int S3 = ((N/lcm(X, Y))/2) * ((2 * lcm(X,Y)) + (N/lcm(X,Y) - 1) * lcm(X,Y))/2;
int S = S1 + S2 - S3;
return S;
	}
	public static void main(String []args)
	{
	  Scanner sc= new Scanner(System.in);
      int N=sc.nextInt();
      int X=sc.nextInt();
      int Y=sc.nextInt();
	System.out.println(sum(N, X, Y));
	}
}
