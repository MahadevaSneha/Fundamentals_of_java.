/*Remove ArrayList Elements
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

ArrayList: [Dog, Cat, Horse]
Updated ArrayList: [Dog, Cat]
Removed Element: Horse
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        ArrayList a=new ArrayList();
        a.add("Dog");
        a.add("Cat");
        a.add("Horse");
        System.out.println("ArrayList: "+a);
        a.remove("Horse");
        System.out.println("Updated ArrayList: "+a);
        System.out.println("Removed Element: Horse");
    }
}
