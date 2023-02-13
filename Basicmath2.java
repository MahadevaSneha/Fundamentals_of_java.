/*
Basic Mathematical Operations
Requested files: Basicmath.java (Download)
Maximum number of files: 5
Type of work: Individual work
Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return the result of numbers after applying the chosen operation.
Examples(Operator, value1, value2) --> output
Sample Input-1
+
4
7
Sample Output-1
11
Sample Input-2
-
15
18
Sample Output-2
3
*/
import java.util.Scanner;
public class Basicmath
{
    public static double Maths(String symbol, double x, double y)
    {
         
       
        double z=0;
        switch(symbol)
        {
            case "+":
             z=x+y;
            break;
            case "-":
              z=x-y;
             break;
            case "*":
                 z=x*y;
             break;
            case "/":
                  z=x/y;
                break;
        
         
        }
        return z;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String symbol=sc.nextLine();
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z= Maths(symbol,x,y);
        System.out.println(z);
    }
}
