/*LCM of two numbers
Requested files: Lcm.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to find LCM of two numbers is discussed here. Two numbers are obtained as input and the prime factors of both the numbers are found. The product of the union of prime factors of both the numbers gives the LCM of the two numbers.

Input & Output Format:

Input consists of two integers.

Output consists of the lcm of two numbers.

Sample Input:

5

30

Sample Output:

LCM of 5 and 30 is 30

*/
import java.util.Scanner;
public class Lcm 
{  
public static void main(String args[])   
{  
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
int gcd = 1;  
for(int i = 1; i <= a && i <= b; ++i)   
{  
if(a % i == 0 && b % i == 0)  
gcd = i;  
}  
int lcm = (a * b) / gcd;  
System.out.printf("The LCM of %d and %d is %d", a, b, lcm);  
}  
}  
 
