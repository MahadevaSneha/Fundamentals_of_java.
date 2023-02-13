/*Reversed Strings
Requested files: Reverse.java (Download)
Maximum number of files: 5
Type of work: Individual work
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
Sample Input:
hello
Sample Output: 
olleh
*/
import java.io.*;
import java.util.Scanner;

class Reverse {
public static void main (String[] args) {
Scanner sc= new Scanner(System.in);
String str = sc.nextLine();
String nstr="";
char ch;
for (int i=0; i<str.length(); i++)
{
 nstr=str.charAt(i)+nstr;
}
System.out.println(nstr);
}
}


