/*Remove an element from the top of the stack
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To remove an element from the top of the stack, we use the pop() method. 
Sample Output: 

Initial Stack: [Dog, Horse, Cat]
Removed Element: Cat

Requested files*/
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Stack<String> stk=new Stack<String>();
		stk.push("Dog");
		stk.push("Horse");
		stk.push("Cat");
		System.out.println("Initial Stack: "+stk);
		stk.pop();
		System.out.println("Removed Element: Cat");
    }
}
