/*Magic year
Requested files: Magic.java (Download)
Type of work: Individual work
The date June 10, 1960 is special because when we write it in the following format,
the month times the day equals the year.
6/10/60
Write a program that asks the user to enter a month (in numeric form), a day, and a
two-digit year.  The program should then determine whether the month times the day
is equal to the year.  If so, it should display a message saying the date is magic.
Otherwise it should display a message saying the date is not magic.
sample input:

2022       (year)

20               (day)

12               (month)

sample output:

its not magic year
*/
import java.util.Scanner;
class Magic{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int d=sc.nextInt();
        int m=sc.nextInt();
        if(d*m==y)
        {
            System.out.println("its magic year "+y);
        }
        else{
            System.out.println("its not magic year");
        }
    }
}
