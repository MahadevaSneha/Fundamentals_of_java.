/*Power of a number
Requested files: Powerofanumber.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to find the power of a number in Java. In order to find the power of a number, multiply the number itself up to exponent times.

Example:
Suppose, 5 is the base and 4 is the exponent. In order to find the power of a number, multiply the number itself 4 times, i.e. (5 * 5 * 5 * 5 = 625).

Steps to Find Power of a Number
Read or initialize base and exponent.
Take another variable (power) to store the result and initialize it to 1.
Using the for loop or while loop, multiply the base by power and store the result into power.
Repeat the above step (3) until the exponent becomes 0.
Print the result.
Sample Input-1:
5
3
Sample Output-1:
125
*/
import java.util.Scanner;  
public class Powerofanumber 
{  

static int power(int base, int exponent)  
{  
 int power=(int)Math.pow(base,exponent);
 return power;
}  

public static void main(String args[])  
{  
int base, exponent;  
Scanner sc=new Scanner(System.in);  
base=sc.nextInt();  
exponent=sc.nextInt();  
int pow=power(base, exponent);  
System.out.println(pow);  
}  
}  
