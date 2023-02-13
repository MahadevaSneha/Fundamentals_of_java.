/*Access Vector Elements
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

Element at index 2: Cat

Vector: Dog, Horse, Cat,
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        Vector<String> v=new Vector<String>();
        v.add("Dog");
        v.add("Horse");
        v.add("Cat");
        System.out.println("Element at index 2: "+v.get(2));
       
        System.out.println("Vector: "+v);
    }
}
