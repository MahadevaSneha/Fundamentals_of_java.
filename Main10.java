/*Insert elements in Deque using offer(), offerFirst() and offerLast()
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 



Insert elements using offer(), offerFirst() and offerLast()

offer() - inserts the specified element at the end of the array deque
offerFirst() - inserts the specified element at the beginning of the array deque
offerLast() - inserts the specified element at the end of the array deque

Sample Output: 
ArrayDeque: [Cat, Dog, Horse]
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        ArrayDeque<String> q=new ArrayDeque<String>();
        q.offerFirst("Cat");
        q.add("Dog");
        q.offer("Horse");
        System.out.println("ArrayDeque: "+q);
    }
}
