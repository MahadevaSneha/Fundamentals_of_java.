/*Basic Mathematical Operations
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
         switch(c)
        {
            case "+":
            int sum=a+b;
            System.out.println(sum);
            break;
            case "-":
            int sub=a-b;
            System.out.println(sub);
            case "*":
                int mul=a*b;
            System.out.println(mul);
            case "/":
                int div=a/b;
                System.out.println(div);
            default:
            System.out.println("Invalid");
        }
    }
}
