/*Add elements to stack
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using collection to display the following output:

Methods: 

To add an element to the top of the stack, we use the push() method.
Sample Output: 

Stack: [Dog, Horse, Cat]
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        Stack<String> stk=new Stack<String>();
		stk.push("Dog");
		stk.push("Horse");
		stk.push("Cat");
		//stk.pop();
		System.out.println("Stack: "+stk);
    }
}
