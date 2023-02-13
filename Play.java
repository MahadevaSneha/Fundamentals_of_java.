/*
Play with X1, X2 and Y1,Y2
Requested files: Play.java (Download)
Maximum number of files: 5
Type of work: Individual work
Python program to calculate the distance between two points. 

How to calculate the distance between two points?

The distance between two points formula is derived from the Pythagorean Theorem.

What is the formula to find the distance between two points?

Use the Pythagoras formula to find the distance.  

Input Order: 

x1, Y1, X2, Y2

Sample Input: 

11

5

5

5

Sample Output: 

5.0

*/
import java.util.Scanner;
class Play
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x1=sc.nextFloat();
        float y1=sc.nextFloat();
        float x2=sc.nextFloat();
        float y2=sc.nextFloat();
        double d=Math.sqrt((x1-x2)*(x1-x2)-(y1-y2)*(y1-y2));
        System.out.printf("%.1f",d);
    }
}
