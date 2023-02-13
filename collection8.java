/*Add Elements to Vector
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

Vector: [Dog, Horse, Cat]
New Vector: [Crocodile, Dog, Horse, Cat]
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
        System.out.println("Vector: "+v);
       v.add(0, "Crocodile");
         
        System.out.println("New Vector: "+v);
    }
}
