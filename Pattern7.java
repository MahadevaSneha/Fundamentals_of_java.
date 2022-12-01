/*
Pattern VII
Requested files: Pattern7.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample input 1:
5
Sample output 1:
*****
*     *
*     *
*     *
***** 

Sample input 2:
8
Sample output 2:
********
*          *
*          *
*          *
*          *
*          *
*          *
********


*/
import java.util.Scanner;
public class Pattern7
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       if(n>=1)
       for(int i=1;i<=n;i++)
       {
           System.out.printf("*");
       }
       System.out.println();
      if(n==6||n==10||n==11||n==15||n==16||n==20)
               System.out.printf("*");
           System.out.println();
           for(int j=n*n-4;j<=n*n;j++)
           {
               System.out.printf("*");
           }
    }
    
   
}
