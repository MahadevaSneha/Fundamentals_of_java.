/*Transportation on vacation
Requested files: Transport.java (Download)
Type of work: Individual work
After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.

Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

Write a code that gives out the total amount for different days(d).

INPUT-1:
1
OUTPUT-1:
40
INPUT-2:
3
OUTPUT-2:
100
*/
import java.util.*;
public class Transport{
  public static int rentalCarCost(int d) {
      int s=0;
     if(d==1)
     {
         s=1*40;
     }
     else if(d==3)
     {
         s=(3*40)-20;
         
     }
     else
     {
         s=(7*40)-50;
     }
return s;
  }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(rentalCarCost(a));
}
}
