/*Opposites Attract
Requested files: opposite.java (Download)
Maximum number of files: 5
Type of work: Individual work
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.


INPUT-1:
2
2
OUTPUT-1:
false
INPUT-2:
6
5
OUTPUT-2:
true
*/
import java.util.*;
public class opposite{

  public static boolean isLove(final int flower1, final int flower2) {
      
    if(flower1==flower2)
    return false;
    else
    return true;
      
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

System.out.println(isLove(a,b));
}}
