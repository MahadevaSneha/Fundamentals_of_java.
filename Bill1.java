/*Electricity bill using method
Requested files: Bill.java (Download)
Maximum number of files: 5
Type of work: Individual work
If you wondering how to calculate an Electricity bill by writing the Java program there you go. 
For example, a consumer consumes 500 watts per hour daily for one month.  Calculate the total energy bill of that consumer if the per unit rate is 7.
[Take 1 month = 30 Days].
Total Kilo watts X Number of hours in a month X Cost 

500 watts x 24 hours x 30 days

= 360000

So, we want to convert into units:

Where 1 unit = 1kWh

Total consumed units are as 360000/1000 = 360

And, cost per unit is = 7, the total cost of the electricity bill is 360 x 7 = 2520

Formula
units<100 = billpay=units*1.20;

units<=300 = billpay=100*1.20+(units-100)*2;

units>300 = billpay=100*1.20+200 *2+(units-300)*3;

Sample input:

98

Sample Output: 
117.6
*/
import java.util.Scanner;
class Bill
{ 
public static void main(String args[]) 
{   
double units,b;
Scanner sc=new Scanner(System.in);
units=sc.nextDouble();
b= calculateElectricityBill(units);
System.out.println(b); 
     }
	static double calculateElectricityBill(double units)
	{
	double billpay=0;
     if(units<100 )
        {
            billpay=units*1.20;
            
        }
        else if(units<=300)
        {
            billpay=100*1.20+(units-100)*2;
           
        }
        else
        {
            billpay=100*1.20+200 *2+(units-300)*3;
            
        } 
        return billpay;
	}
}
