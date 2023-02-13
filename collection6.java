/*Change Elements of a LinkedList
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Java, Python, JavaScript, Java]
Updated LinkedList: [Java, Python, JavaScript, Kotlin]
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add("Java");
        l.add("Python");
        l.add("JavaScript");
        l.add("Java");
        System.out.println("LinkedList: "+l);
        l.remove(3);
        l.add(3,"Kotlin");
        System.out.println("Updated LinkedList: "+l);
    }
}
