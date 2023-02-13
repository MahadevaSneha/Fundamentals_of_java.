/*Got a Furniture? Resell it..
Requested files: Furniture.java (Download)
Maximum number of files: 5
Type of work: Individual work
Java program to calculate Depreciation. Depreciation is a financial word, defined as the reduction of the recorded cost of a fixed asset in a systematic manner until the value of the asset becomes zero or negligible. 

What is Depreciation?

The decrease in value of assets (fair value depreciation)
The allocation of the cost of assets to periods in which the assets are used (depreciation with the matching principle)
Depreciation is a method of reallocating the cost of a tangible asset over its useful lifespan of it being in motion. Businesses depreciate long-term assets for both tax and accounting purposes.
Sample Input: 
10000
5
5
Sample Output:
7736
*/
import java.util.Scanner;
public class Furniture
{
public static void main(String arg[])	
	{
long amount,deppercent,year,afterdep,temp;
Scanner sc=new Scanner(System.in);
amount=sc.nextLong();
deppercent=sc.nextLong();
year=sc.nextLong();
temp=depreciationCal(amount,deppercent,year);
System.out.println(temp);
	}
static long depreciationCal(long amount,long deppercent, long year )
	{ 
	    long temp=amount;
for(int i=0;i<year;i++)
temp=((100-deppercent)*temp)/100;
return temp;
	}
}
