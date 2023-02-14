/*Implementation of the Queue Interface
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

Sample Output: 
Queue: [1, 2, 3]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 3]
*/
import java.util.*;
public class queue{
    public static void main(String args[])
    {
        Queue p = new PriorityQueue();
        p.add(1);
        p.add(2);
        p.add(3);
        System.out.println("Queue: "+p);
        System.out.println("Accessed Element:"+p.peek());
        System.out.println("Removed Element: "+p.remove());
        System.out.println("Updated Queue: "+p);
        
    }
}
