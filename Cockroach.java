/*Beginner Series-Cockroach
Requested files: Cockroach.java (Download)
Maximum number of files: 5
Type of work: Individual work
The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).

INPUT 1:

1.08

OUTPUT 1:

30

INPUT 2:

2.09

OUTPUT 2:

58
*/
import java.util.*;
public class Cockroach{
  public static int cockroachSpeed(double x){
    int s=(int)(x/0.036);
    return s;
  }

  
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
System.out.println(cockroachSpeed(x));
}}
