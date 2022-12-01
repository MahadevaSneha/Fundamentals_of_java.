/*String Reverse
Requested files: String4.java (Download)
Type of work: Individual work
Write a program to find the reverse of the given without string using string library functions: 

Input & Output Format:

Input consists of 1 string.

Output consists of reversed string.

Sample Input:
cyfuno

Sample Output:

onufyc

*/
import java.util.Scanner;
public class String4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        String m="";
        for(int i=0;i<str.length();i++)
        {
          m=str.charAt(i)+m;
        }
         System.out.printf(m);
    }
}
