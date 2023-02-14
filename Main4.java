/*Implementing the PriorityQueue Class
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

Sample Output: 
Queue: [1, 5, 2]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 5]
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        PriorityQueue p = new PriorityQueue();
        p.add(1);
        p.add(5);
        p.add(2);
        System.out.println("Queue: "+p);
        System.out.println("First Element: "+p.peek());
        System.out.println("Removed Element: "+p.remove());
        System.out.println("Updated Queue: "+p);
        
    }
}
