/*Quarter of the year
Requested files: Quarter.java (Download)
Maximum number of files: 5
Type of work: Individual work
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.

INPUT 1:
8
OUTPUT 1:
3
INPUT 2:
3
OUPUT 2:
1
*/
import java.util.*;
public class Quarter{
    public static int quarterOf(int month) 
    {
        if(month>0 && month<4)
        return 1;
        else if(month >4 && month<7)
        return 2;
        else if(month >7 && month<10)
        return 3;
        else
        return 4;
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(quarterOf(a));
}}
