/*
Lets play Cricket
Requested files: Cricket.java (Download)
Maximum number of files: 5
Type of work: Individual work
Python Program to calculate the batting average.

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


batting average=250.0*/
import java.util.Scanner;
class Cricket
{
    public static void main(String args[])
    {
        double m;
        double i;
        double n;
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of matches played");
         m=sc.nextDouble();
         System.out.println("enter the number innings batted");
        i=sc.nextDouble();
        System.out.println("enter number of times notout");
          n=sc.nextDouble();
        System.out.println("enter runs scored");
          s=sc.nextDouble();
        double avg=s/(i-n);
        System.out.printf("batting average=%.1f",avg);
        
    }
}
