/*Series III
Requested files: Series3.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to generate the first n terms in the series --- 3, 9, 27, 81,...,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input & Output:

5

3 9 27 81 243 




*/
import java.util.Scanner;
public class Series3
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
       int i;
         int power=0;
         int n=sc.nextInt();
       int num=3;
         for(i=1;i<=n;i++)
         {
      power=(int)Math.pow(num,i);
       System.out.printf("%d ",power);
         }
          
    }
}
  
