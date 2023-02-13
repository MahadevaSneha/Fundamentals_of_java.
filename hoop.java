/*Keep up the hoop
Requested files: hoop.java (Download)
Maximum number of files: 5
Type of work: Individual work
Alex just got a new hula hoop, he loves it but feels discouraged because his little brother is better than him

Write a program where Alex can input No how many times the hoop goes round and it will return him an encouraging message smile

If Alex gets 10 or more hoops, return the string "Great, now move on to tricks".
If he doesn't get 10 hoops, return the string "Keep at it until you get it".

INPUT-1:
10
OUTPUT-1:
Great, now move on to tricks
INPUT-2:
5
OUTPUT-2:
Keep at it until you get it
*/
import java.util.*;
public class hoop{
  public static String hoopCount(int n){
   if(n>=10)
   return "Great, now move on to tricks";
   else
   return "Keep at it until you get it";
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
System.out.println(hoopCount(b));
}}
