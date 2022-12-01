/*Palindrome or Not
Requested files: String9.java (Download)
Type of work: Individual work
Write a program to find whether the given string is palindrome or not without using string library functions: 

 INPUT & OUTPUT FORMAT: 

Input consists of 1 string. If the given string is a Palindrome display “palindrome”, else display “Not a Palindrome”.

Sample Input:
liril

Sample Output:
palindrome

*/
import java.util.Scanner;
public class String9
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
        if(str==m)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        
    }
}
