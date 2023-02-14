/*Insert Elements to Deque
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 


Add elements using add(), addFirst() and addLast()

add() - inserts the specified element at the end of the array deque
addFirst() - inserts the specified element at the beginning of the array deque
addLast() - inserts the specified at the end of the array deque (equivalent to add())

Sample Output: 
ArrayDeque: [Cat, Dog, Horse]
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        ArrayDeque<String> q=new ArrayDeque<String>();
        q.add("Cat");
        q.add("Dog");
        q.add("Horse");
        System.out.println("ArrayDeque: "+q);
    }
}
