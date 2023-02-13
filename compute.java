/*Compute the value- L2
Requested files: compute.java (Download)
Type of work: Individual work
Write a program that computes the value of a+aa+aaa+aaaa with a given digit as the value of a.

Sample Input-1: 

9

Sample Output-1: 

11106

Sample Input-2: 

11

Sample Output-2: 

11223344

*/
import java.util.Scanner;
class compute
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i = Integer.parseInt(str);
        String s=str+str;
         int j = Integer.parseInt(s);
        String s1=str+str+str;
         int k = Integer.parseInt(s1);
        String s2=str+str+str+str;
         int l = Integer.parseInt(s2);
         int sum=i+j+k+l;
         System.out.println(sum);
        
    }
}
