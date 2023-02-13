/*Method to calculate Discount
Requested files: Discount.java (Download)
Maximum number of files: 5
Type of work: Individual work
Java program to calculate the discount of a product. With the help of the following program, you can calculate the discount on a product instantly.

How to calculate a discount on a product?

A:  Discount is defined as the reduction in the price something you sell to the customers.  Most of the discount rate is given in percentage rate.

Here is the formula to calculate the discount:

Discount = List price x Discount Rate

For example :

A pen costs 50$ and it is been sold at a discount of 12%, what is the discount price of the pen?

A: = 50 x 12/100

= 50 × 0.12

= $ 6

Sample input:
10000
15
Sample Output: 
8500.0
*/
import java.util.Scanner;
public class Discount
{
	public static void main(String[] args) {
    double  dis,amount,markedprice,s;
    Scanner sc= new Scanner(System.in);
    markedprice= sc.nextDouble();    
    dis= sc.nextDouble();
    s=dis;
	amount= calcuateDiscount(markedprice,s);
    System.out.println(amount); 
	}

static double calcuateDiscount(double markedprice,double s)
          {   
              
              double dis=s*markedprice/100;
               double amount=markedprice-dis;
                return amount; 
         }
         
} 
//float d=(lp*dr)/100;
      //  float c=lp-d;
