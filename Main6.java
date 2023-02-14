/*Remove PriorityQueue Elements
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

remove() - removes the specified element from the queue
poll() - returns and removes the head of the queue

Sample Output: 
PriorityQueue: [1, 4, 2]
Is the element 2 removed? true
Removed Element Using poll(): 1
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        PriorityQueue p = new PriorityQueue();
        p.add(1);
        p.add(4);
        p.add(2);
        System.out.println("PriorityQueue: "+p);
        
        System.out.println("Is the element 2 removed? "+p.remove(2));
        System.out.println("Removed Element: "+p.poll());
        //System.out.println("Updated Queue: "+p);
        
    }
}
