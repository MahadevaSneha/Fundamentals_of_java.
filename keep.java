/*Keep Hydrated!
Requested files: keep.java (Download)
Maximum number of files: 5
Type of work: Individual work
Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

INPUT-1:

3

OUTPUT-1:

1

INPUT-2:

6.7

OUTPUT-2:

3

*/
import java.util.*;
public class keep{

  public static int Liters(double time)  {
    
     
    double m=0.5*time;
    int m1=(int)m;
    return m1;
  
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double b=sc.nextDouble();
System.out.println(Liters(b));
}}
