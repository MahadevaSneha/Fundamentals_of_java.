/*Volume of a Cuboid
Requested files: Cuboid.java (Download)
Maximum number of files: 5
Type of work: Individual work
Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid. Write a function to help Bob with this calculation.

INPUT 1:

5

6

7

OUTPUT 1:

210.0

INPUT 2:

45.8

2.7

13.9

OUTPUT 2:

1718.874
*/
import java.util.*;
public class Cuboid{

  public static double getVolumeOfCuboid(double length,double width,double height) {
    
    double v=length* width*height;
    return v;
  
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double length=sc.nextDouble();
double width=sc.nextDouble();
double height=sc.nextDouble();
System.out.println(getVolumeOfCuboid(length,width,height));
}}
