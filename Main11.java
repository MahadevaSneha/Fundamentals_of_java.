Access Array Deque Elements
Requested files: Main.java (Download)
Type of work: Individual work
ArrayDeque: [Dog, Cat, Horse]
First Element: Dog
Last Element: Horse
*/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Deque<String> q=new ArrayDeque<String>();
        q.offerFirst("Dog");
        q.add("Cat");
        q.offer("Horse");
        System.out.println("ArrayDeque: "+q);
        System.out.println("First Element: "+q.getFirst());
        System.out.println("Last Element: "+q.getLast());
        
    }
}/*
