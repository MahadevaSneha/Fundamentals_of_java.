/*Count Odd Numbers below n
Requested files: Oddcount.java (Download)
Maximum number of files: 5
Type of work: Individual work
Given a number  N , return the number of positive odd numbers below N.

INPUT 1:

7

OUTPUT 1:

3

INPUT 2:

15

OUTPUT 2:

7



*/
import java.util.*;
public class Oddcount {

  public static int oddCount(int n){
     int count=0;
    if(n>0)
    {
        for(int i=0;i<n;i++)
        {
         if(i%2==1)
         {
             count++;
         }
        }
         
    }
    return count;
  }


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(oddCount(a));
}}
