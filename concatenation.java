/*Concatenation-L1
Requested files: concatenation.java (Download)
Type of work: Individual work
Define a function that can accept two strings as input and concatenate them and then print it in the console without using a string predefined function, also don’t use the ‘+’ operator. The user will give n values until and unless the user enters -1.

Sample input:

Hello

World

up

-1

Sample output:

HelloWorld

*/
import java.util.Scanner;
public class concatenation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        String str3=sc.nextLine();
        int a=sc.nextInt();
        String s=String.format("%s%s",str,str1);
        System.out.println(s.toString());

        
    
    }
}
