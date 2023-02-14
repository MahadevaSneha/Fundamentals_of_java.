/*Remove Array Deque Element: using the clear() method
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:



To remove all the elements from the array deque, we use the clear() method
Sample Output: 

ArrayDeque: [Dog, Cat, Horse]

New ArrayDeque: []
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Deque<String> q=new ArrayDeque<String>();
        q.add("Dog");
        q.add("Cat");
        q.add("Horse");
        System.out.println("ArrayDeque: "+q);
        q.clear();
        System.out.println("New ArrayDeque: "+q);
        
    }
}
