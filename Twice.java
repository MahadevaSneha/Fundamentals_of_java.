/*Twice as old
Requested files: Twice.java (Download)
Maximum number of files: 5
Type of work: Individual work
Your function takes two arguments:

current father's age (years)
current age of his son (years)
Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.

INPUT 1:

30

0

OUTPUT 1:

30

INPUT 2:

30

7

OUTPUT 2:

16
*/
import java.util.*;
public class Twice {

  public static int TwiceAsOld(int dadYears, int sonYears){
    //write your logic here
    int age= dadYears-sonYears*2;
    return age;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int dadYears=sc.nextInt();
int sonYears=sc.nextInt();
System.out.println(TwiceAsOld(dadYears,sonYears));
}}
