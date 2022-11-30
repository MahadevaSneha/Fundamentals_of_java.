/*Hotel Tariff Calculator
Requested files: Hotel.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a  program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December] .

Input Format:

The first line of the input contains an integer which corresponds to the number of the month. [ January is 1, Feb is 2 and so on].  

The second line of the input consists of a floating point number which corresponds to the room rent per day. 

The third line of the input consists of an integer which corresponds to the number of days stayed in the hotel.

Output Format:

Output consists of a single line which displays the hotel tariff to be payed.  

Hotel tariff should be displayed correct to 2 decimal places. 

Refer  sample output  for format details.

Sample Input 1:

3

1500

2

Sample Output 1:

Hotel Tariff: Rs.3000.00

Sample Input 2:

4

2000

2

Sample Output 2:

Hotel Tariff: Rs.4800.00

*/
import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int months=sc.nextInt();
        float rent=sc.nextInt();
    float days=sc.nextInt();
    if(months==4||months==5||months==6||months==11||months==12)
    {
       float h=((20*rent)/100)+400;
           float r=rent*days;
        System.out.printf("Hotel Tariff: Rs.%.2f",(r+h));
    }
    else if( months==1||months==2||months==3||months==7||months==8||months==9||months==10)
    {
          float r=rent*days;   
    System.out.printf("Hotel Tariff: Rs.%.2f",r);
       
    }
    else
    {
        System.out.println("Invalid Input");
    }
    }
}
import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int months=sc.nextInt();
        float rent=sc.nextInt();
    float days=sc.nextInt();
    if(months==4||months==5||months==6||months==11||months==12)
    {
       float h=((20*rent)/100)+400;
           float r=rent*days;
        System.out.printf("Hotel Tariff: Rs.%.2f",(r+h));
    }
    else if( months==1||months==2||months==3||months==7||months==8||months==9||months==10)
    {
          float r=rent*days;   
    System.out.printf("Hotel Tariff: Rs.%.2f",r);
       
    }
    else
    {
        System.out.println("Invalid Input");
    }
    }
}
