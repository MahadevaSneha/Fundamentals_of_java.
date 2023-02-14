/*Insert Elements to PriorityQueue
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
offer() - Inserts the specified element to the queue. If the queue is full, it returns false.

Sample Output: 
PriorityQueue: [2, 4]
Updated PriorityQueue: [1, 4, 2]
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        PriorityQueue p = new PriorityQueue();
        p.add(2);
        p.add(4);
        System.out.println("PriorityQueue: "+p);
        p.add(1);
        System.out.println("Updated PriorityQueue: "+p);
        
    }
}
