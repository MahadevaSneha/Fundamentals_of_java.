/*Century From Year
Requested files: Century.java (Download)
Maximum number of files: 5
Type of work: Individual work
The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

Task
Given a year, return the century it is in.

INPUT 1:
1705
OUTPUT 1:
18
INPUT 2:
1900
OUTPUT 2:
19
*/
import java.util.*;
public class Century{
  public static int century(int number) {
    if(number>=1700 && number<=1800)
    return 18;
    else
    return 19;
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println(century(number));
}}
