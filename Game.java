/*Karthi’s Paintings
Requested files: Game.java (Download)
Maximum number of files: 5
Type of work: Individual work
A wall is of length L and breadth B. Karthi is trying to fit two rectangular paintings in it. He wants to fit these paintings on the wall such that they do not overlap on each other or they should not move outside the area of the wall. He also knows the length and breadth of both the paintings. Help him in finding whether two paintings can fit in to the wall properly or not.

INPUT & OUTPUT FORMAT:

Input consists of 6 integers.

First and second input corresponds to the length and breadth of the wall.

Third and fourth input corresponds to the length and breadth of the first painting.

Fifth and sixth input corresponds to the length and breadth of the second painting.

If both the paintings can be fixed on the wall, display “Karthi can fix both painting” or display “Karthi cannot fix both painting”.


Sample Input:
10
10
5
5
5
5

Sample Output:
Karthi can fix both painting

*/
import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int b1=sc.nextInt();
        int l2=sc.nextInt();
        int b2=sc.nextInt();
        int l3=sc.nextInt();
        int b3=sc.nextInt();
        int v=l1*b1;
        int v1=l2*b2;
        int v3=l3*b3;
        int c=v1+v3;
        if(c<=v)
        {
            System.out.println("Karthi can fix both painting");
        }
        else
        {
            System.out.println("Karthi cannot fix both painting");
        }
    }
}
