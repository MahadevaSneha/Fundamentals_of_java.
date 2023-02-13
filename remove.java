/*Remove First and Last Character
Requested files: remove.java (Download)
Maximum number of files: 5
Type of work: Individual work
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.


INPUT-1:
eloquent
OUTPUT-1:
loquen
INPUT-2:
country

OUTPUT-2:

ountr
*/
import java.util.*;
public class remove{
    public static String remove(String str) {
         str=str.substring(1,str.length()-1);
		 return str;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.next();
System.out.println(remove(a));
}}
