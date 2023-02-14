/*Access Array Deque using peek(), peekFirst() and peekLast() method
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:

Access elements using peek(), peekFirst() and peekLast() method

peek() - returns the first element of the array deque
peekFirst() - returns the first element of the array deque (equivalent to peek())
peekLast() - returns the last element of the array deque
Sample Output: 


ArrayDeque: [Dog, Cat, Horse]
Head Element: Dog
First Element: Dog
Last Element: Horse
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Deque<String> q=new ArrayDeque<String>();
        q.offerFirst("Dog");
        q.add("Cat");
        q.offer("Horse");
        System.out.println("ArrayDeque: "+q);
        System.out.println("Head Element: "+q.peekFirst());
        System.out.println("First Element: "+q.getFirst());
        System.out.println("Last Element: "+q.getLast());
        
    }
}
