/*Remove Array Deque Elements
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:


Remove elements using the remove(), removeFirst(), removeLast() method

remove() - returns and removes an element from the first element of the array deque
remove(element) - returns and removes the specified element from the head of the array deque
removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
removeLast() - returns and removes the last element from the array deque
Sample Output: 


ArrayDeque: [Dog, Cat, Cow, Horse]
Removed Element: Dog
New ArrayDeque: [Cat, Cow, Horse]
Removed First Element: Cat
Removed Last Element: Horse
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Deque<String> q=new ArrayDeque<String>();
        q.add("Dog");
        q.add("Cat");
        q.add("Cow");
        q.add("Horse");
        System.out.println("ArrayDeque: "+q);
        System.out.println("Removed Element: "+q.remove());
        System.out.println("New ArrayDeque: "+q);
        System.out.println("Removed First Element: "+q.removeFirst());
        System.out.println("Removed Last Element: "+q.removeLast());
        //System.out.println("Last Element: "+q.getLast());
        
    }
}
