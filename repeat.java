/*String repeat
Requested files: repeat.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

INPUT 1:

6

K

OUTPUT 1:

KKKKKK

INPUT 2:

4

HELLO

OUTPUT 2:

HELLOHELLOHELLOHELLO
*/
import java.util.*;
class repeat{
  static String repeatStr(int repeat, String string) {
    for(int i=0;i<repeat;i++)
        System.out.print(string);
    return "";
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String b=sc.next();
System.out.println(repeatStr(a,b));
}
}
