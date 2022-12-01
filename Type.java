/*
Array Type
Requested files: Type.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a C program to find the type of array as whether it is even, odd or mixed. If all the elements of an array are even, then display the array type as even. If all the elements of an array are odd, then display the array type as odd. If an array has both even and odd elements, then display the array type as mixed.

Sample Input:
5
2
4
1
3
5

Sample Output:
Mixed 


*/
import java.util.Scanner;
public class Type
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0,count1=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            count=count+1;
            else
            count1=count1+1;
        }    
            if(count==n)
            {
               
                System.out.println("Even");
            }
            else if(count1==n)
            {
                System.out.println("Odd");
            }
            else
            {
                System.out.println("Mixed");
       
         }
        
    }
}
