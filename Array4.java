/*Array List- Update list
Requested files: Array3.java (Download)
Type of work: Individual work
Write a program using ArrayList to print the follwoing output:
ArrayList: [Java, Kotlin, C++]
Modified ArrayList: [Java, Kotlin, JavaScript]
*/
import java.util.*;
class Array3
{
    public static void main(String args[])
    {
        ArrayList<String> s=new ArrayList<String>();
        s.add("Java");
        s.add("Kotlin");
        s.add("C++");
        System.out.println("Arraylist: "+s);
        s.remove("C++");
        s.add("JavaScript");
        System.out.println("Modified ArrayList: "+s);
    }
}
