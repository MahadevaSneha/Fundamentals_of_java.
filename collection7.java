/*Remove element from a LinkedList
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Java, Python, JavaScript, Kotlin]
Removed Element: Python
New LinkedList: [Java, JavaScript, Kotlin]*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add("Java");
        l.add("Python");
        l.add("JavaScript");
        l.add("Kotlin");
        System.out.println("LinkedList: "+l);
        l.remove(1);
        System.out.println("Removed Element: Python");
        System.out.println("New LinkedList: "+l);
    }
}
