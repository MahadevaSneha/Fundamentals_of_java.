/*Method- Area Calculation
Requested files: Area5.java (Download)
Maximum number of files: 5
Type of work: Individual work
Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in different shapes. The three things are in square shape, rectangular shape, and circular shape respectively. Write a program to help Sheela to calculate the area of different shapes. 

Input format: 

First input: a side of a square in integer 

Second input: length of a rectangle in integer 

Third input: breadth of a rectangle in integer 

Fourth input: radius of a circle in float 

Output format: 

The first output should be the area of a square in integer 

The second output should be the area of a rectangle in integer 

The third output should be the area of a circle in float with 2 decimal places

Sample Input: 

5

5

4

2.0

Sample Output: 

25

20

12.56

*/
import java.util.Scanner;
public class Area5
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Area3 ar=new Area3();
       Area1 ar1=new Area1();
       Area2 ar2=new Area2();
        int a=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        float r=sc.nextFloat();
        int m=ar.Areasq(a);
        System.out.println(m);
        int s=ar1.Rect(l,b);
        System.out.println(s);
        float c=ar2.Circle(r);
        System.out.printf("%.2f",c);
    }
}
class Area3
{
    public static int Areasq(int a)
    {
     int areasq=a*a;  
     return areasq;
    }
     
} 
class Area1
{
    public static int Rect(int l,int b)
    {
         int rect=l*b;
          return rect;
    }
    
}
class Area2
{
    public static float Circle(float r)
    {
        float pi=3.14f;
float circle=pi*r*r;
return circle;
}
}         
