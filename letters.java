/*The number of letters and digits in a String- L2
Requested files: letters.java (Download)
Type of work: Individual work
Write a program that accepts a sentence and calculate the number of letters and digits.

Suppose the following input is supplied to the program:

Input Format:

Input consists of a string. 

Output Format: 

The output consists of a calculation of number of digits and letters. 

Sample Input: 

hello world! 123

Sample output:

LETTERS 10

DIGITS 3*/



 import java.util.Scanner;
class letters{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int digits=0;
        int letters=0;
        int s=0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if ((ch >= 'a' ||ch>='A' ) &&( ch <= 'z' || ch<='Z'))
                letters++;
            else if(ch >= '0' && ch <= '9')
                digits++;
             
            else
                s++;
        }
          System.out.println("LETTERS "+letters);
        System.out.println("DIGITS "+digits);
    }
}


