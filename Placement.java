*Placement Program
Requested files: Placement.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to find which department students placed for the max in the college. 

Sample Input:

Enter the no of students placed in CSE:

25

Enter the no of students placed in ECE:

26

Enter the no of students placed in MECH:

24

Sample Output:

Highest placement 

ECE

*/
import java.util.Scanner;
public class Placement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int n=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int a=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int b=sc.nextInt();
        int max=0;
        if((n>b)&&(n>a))
        {
            max=n;
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(a>b)
        {
            max=a;
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else
        {
            max=b;
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        
        
        
    }
}
