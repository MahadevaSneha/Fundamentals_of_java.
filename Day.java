/*Return the day
Requested files: Day.java (Download)
Maximum number of files: 5
Type of work: Individual work
Complete the function which returns the weekday according to the input number:

1 returns "Sunday"
2 returns "Monday"
3 returns "Tuesday"
4 returns "Wednesday"
5 returns "Thursday"
6 returns "Friday"
7 returns "Saturday"
Otherwise returns "Wrong, please enter a number between 1 and 7"
INPUT 1:
1
OUTPUT 1:
Sunday
*/
import java.util.*;
public class Day {

    public static String getDay(int n) {
        String s=" ";
        switch(n)
        {
            case 1:
                s="Sunday";
                break;
                case 2:
                s="Monday";
                 break;
                case 3:
                s="Tuesday";
                 break;
                case 4:
                s="Wednesday";
                 break;
                case 5:
                s="Thursday";
                 break;
                case 6:
                s="Friday";
                 break;
                case 7:
                    s="Saturday";
                    default:
            s="Wrong, please enter a number between 1 and 7";
        }
    return s;
 }
  

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(getDay(a));
}}
