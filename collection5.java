/*Access LinkedList elements
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Python, Java, JavaScript]
Element at index 1: Java
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add("Python");
        l.add("Java");
        l.add("JavaScript");
        System.out.println("LinkedList: "+l);
        System.out.println("Element at index 1:"+l.get(1));
    }
}
