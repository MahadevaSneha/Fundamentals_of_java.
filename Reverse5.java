/*Reversed Strings
Requested files: Reverse.java (Download)
Maximum number of files: 5
Type of work: Individual work
Complete the solution so that it reverses the string passed into it.

INPUT-1:

world

OUTPUT-1:

dlrow

*/
import java.util.*;
public class Reverse{
public static String solution(String str) {
String nstr="";
char ch;
for (int i=0; i<str.length(); i++)
{
 nstr=str.charAt(i)+nstr;
}
return nstr;
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String b=sc.next();
System.out.println(solution(b));
}}
