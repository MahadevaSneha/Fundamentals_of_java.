/*Create LinkedList in Java
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Dog, Cat, Cow]
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        LinkedList l=new LinkedList();
        l.add("Dog");
        l.add("Cat");
        l.add("Cow");
        System.out.println("LinkedList: "+l);
    }
}
