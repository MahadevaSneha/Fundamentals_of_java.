/*Lets play Cricket
Requested files: Cricket.java (Download)
Maximum number of files: 5
Type of work: Individual work
Java Program to calculate the batting average.

Sample input: 

enter the number of matches played

150

enter the number innings batted

36

enter number of times notout

32

enter runs scored

1000

Sample Output


batting average=250.0
*/
import java.util.Scanner;
class Cricket
{
  public static void main(String arg[])
 {
double Matches,runs,innings,notout;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of matches played");
Matches=sc.nextDouble();
System.out.println("enter the number innings batted");
innings=sc.nextDouble();
System.out.println("enter number of times notout");
notout=sc.nextDouble();
System.out.println("enter runs scored");
runs=sc.nextDouble();
avg=avgCalculation(runs,innings,notout);
System.out.println("batting average="+avg);
 }
static double avgCalculation(double r,double i,double n)
  {
    double avg=r/(i-n);
         return avg;
   }
     
}
