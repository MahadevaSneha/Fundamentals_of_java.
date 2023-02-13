/*Wilson primes
Requested files: Wilson.java (Download)
Maximum number of files: 5
Type of work: Individual work
Wilson primes satisfy the following condition. Let P represent a prime number.

Then,

((P-1)! + 1) / (P * P)
should give a whole number.

Your task is to create a function that returns true if the given number is a Wilson prime.


INPUT 1:
5
OUTPUT 1:
true
INPUT 2:
1
OUTPUT 2:
false
*/
import java.util.*;
public class Wilson{
  public static boolean am_i_wilson(double n) {
    double flag=0;
    double t=0;
    double fact=1;
    for(int i=1;i<=n-1;i++)
    {
        if(n%i==0)
        flag++;
        fact=fact*i;
        if(flag==1)
        t=((fact+1)/(n*n));
    }
    if(t>0)
    return true;
    else
    return false;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
System.out.println(am_i_wilson(a));
}}
