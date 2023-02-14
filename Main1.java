/*Search an element in the stack
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To search an element in the stack, we use the search() method. It returns the position of the element from the top of the stack. 
Sample Output: 
Stack: [Dog, Horse, Cat]
Position of Horse: 2
*/
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
		System.out.println("Position of Horse: "+stk.search("Horse"));
    }
}
