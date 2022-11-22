/*Vowel Or Consonants
 
Write a program to check whether the given character is vowel or consonant or Not an alphabet.
Input format: 
The input consist of a character 
Output format: 
The output consists of a below-given string “Vowel” / “Consonant” / “Not an alphabet”
Sample Input: 

a 

Sample Output: 

Vowel
*/
import java.util.Scanner;
public class Vowcons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);
        if ((input>='a')&&(input<='z'))
        {
        if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
        }
        else
        {
            System.out.println("Not an alphabet");
        }
        
   
    }
}

 
