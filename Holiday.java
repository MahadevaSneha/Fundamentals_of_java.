/*Holiday VIII - Duty Free
Requested files: Holiday.java (Download)
Maximum number of files: 5
Type of work: Individual work
The purpose of this question is to work out just how many bottles of duty free whiskey you would have to buy such that the saving over the normal high street price would effectively cover the cost of your holiday.

You will be given the high street price (normPrice), the duty free discount (discount) and the cost of the holiday.

For example, if a bottle cost £10 normally and the discount in duty free was 10%, you would save £1 per bottle. If your holiday cost £500, the answer you should return would be 500.

All inputs will be integers. Please return an integer. Round down.

INPUT 1:

12

50

1000

OUTPUT 1:

166

INPUT 2:

17

10

500

OUTPUT 2:

294

*/
import java.util.*;
public class Holiday{

  public static int dutyFree(int normPrice, int discount, int hol) {
    
float p=((float)normPrice*(float)discount)/100;
float k=hol/p;
int k1=(int)k;
return k1;
    
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println(dutyFree(a,b,c));
}}
