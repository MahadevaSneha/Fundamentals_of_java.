/*Iterating Over a PriorityQueue
Requested files: Main.java (Download)
Type of work: Individual work
Write a java program using the collection to display the following output:

Methods: 

To iterate over the elements of a priority queue, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. 


Sample Output: 
PriorityQueue using iterator(): 1, 4, 2,
*/
import java.util.*;
import java.util.Iterator;
public class Main{
    public static void main(String args[])
    {
        PriorityQueue p = new PriorityQueue();
        p.add(1);
        p.add(5);
        p.add(2);
        Iterator itr=p.iterator();
	while(itr.hasNext()){
	    System.out.println("PriorityQueue using iterator(): "+itr.next());
	}
        
	}
    
}
