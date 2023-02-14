/*Create HashMap in Java
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:




Sample Output: 


HashMap: {Java=8, JavaScript=1, Python=3}
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Map mp=new HashMap();
        mp.put("Java",8);
         mp.put("JavaScript",1);
         mp.put("Python",3);
    
        System.out.println("HashMap: "+mp);
    }
}
