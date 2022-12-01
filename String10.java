/*Counting Vowels
Requested files: String10.java (Download)
Type of work: Individual work
Write a program to count the number of vowels in the given string: 

 INPUT & OUTPUT FORMAT:

Input consists of 1 string. 

Output print the number of Vowels.

Sample Input:
cyfuno

Sample Output:

2

*/
import java.util.Scanner;
public class String10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for( int j=0;j<str.length();j++)
        {
            char ch=str.charAt(j);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            count++;
        }
        }
        System.out.println(count);
    }
}
