/*Return Negative
Requested files: Negative.java (Download)
Maximum number of files: 5
Type of work: Individual work
Description:

In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

INPUT 1:

7

OUTPUT 1:

-7

INPUT 2:

-52

OUTPUT 2:

-52

INPUT 3:

0

OUTPUT 3:

0
*/
import java.util.*;
public class Negative{
public static int makeNegative(final int x) {
    if(x==0)
    return 0;
    else if(x>0)
    return (-x);
    else
    return x;
    
     }
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println(makeNegative(x));
}}
