/*Calculate the number of upper case letters and lower case letters- L2
Requested files: upper.java (Download)
Type of work: Individual work
Write a program that accepts a sentence and calculate the number of upper case letters and lower case letters.

Suppose the following input is supplied to the program:

Sample input:

Hello world!

Sample output: import java.util.Scanner;
class upper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        int upper = 0, lower = 0; 
        int s=0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if(ch >= 'a' && ch <= 'z') 
                lower++;
                else
                s++;
        }
 
        System.out.println("UPPER CASE " + upper);
        System.out.println("LOWER CASE " + lower);
         
    }
}

UPPER CASE 1

LOWER CASE 9
*/
