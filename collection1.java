/*Iterate through an ArrayList
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

ArrayList: [Cow, Cat, Dog]
Accessing individual elements:  
Cow, Cat, Dog,
*/
import java.util.*;
class collection
{
    public static void main(String args[])
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Cow");
        a.add("Cat");
        a.add("Dog");
        System.out.println("ArrayList: "+a);
        Iterator itr=a.iterator();
	while(itr.hasNext()){
	    System.out.println(itr.next());
	}
    }
}
