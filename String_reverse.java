import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer s=new StringBuffer(A);
        String m=s.reverse().toString();
        if(A.equals(m)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
    }
}



