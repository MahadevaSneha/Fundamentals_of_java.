/*Array List- String2
Requested files: Array2.java (Download)
Type of work: Individual work
Write a program using ArrayList to print the follwoing output:
ArrayList: [Cat, Dog, Cow]
Element at index 1: Dog
*/
//code here
import java.util.*;
class Array2
{
    public static void main(String args[])
    {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Cat");
        a.add("Dog");
        a.add("Cow");
        System.out.println("ArrayList: "+a);
        String m=a.get(1);
        System.out.println("Element at index 1: "+m);
        
    }
}
